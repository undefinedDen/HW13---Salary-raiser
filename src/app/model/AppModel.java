package app.model;


import app.entity.Employee;
import app.exception.AppException;
import app.utils.Constants;
import app.utils.Rounder;
import app.validator.AppValidator;
import app.view.AppView;

import java.util.concurrent.locks.ReentrantLock;

public class AppModel {
    AppValidator validate = new AppValidator();
    private final ReentrantLock lock = new ReentrantLock();
    AppView view = new AppView();

    public void raiseSalary(Employee employee) {
        lock.lock();
        boolean flag = false;
        double raise;


        while (!flag) {
            try {
                view.getDisplayInfo("For - " + employee.getName());
                String raiserStr = view.inputRaise().trim();
                try {
//                    //валидация пустого
                    validate.validationInputEmpty(raiserStr);
                } catch (NullPointerException e) {
                    view.getDisplayInfo(e.getMessage());
                    return;
                }

                try {
//                    //NaN input
                    raise = Double.parseDouble(raiserStr);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("I do not work with letters and symbols. Please, input only numbers");
                }
                try {
                    //валидация негативного
                    validate.validateNegativeInput(raise);
                } catch (AppException e) {
                    view.getDisplayInfo(e.getMessage());
                    return;
                }
                if (raise == 1) {
                    employee.setSalary(employee.getSalary() * raise);
                    System.out.println("Salary for " + employee.getName() + " was not updated " +
                            Constants.CURRENCY + " " + Rounder.round(employee.getSalary()));
                    flag = true;
                } else {
                    employee.setSalary(employee.getSalary() * raise);
                    System.out.println("Salary for " + employee.getName() + " was updated " +
                            Constants.CURRENCY + " " + Rounder.round(employee.getSalary()));
                    flag = true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            } finally {
                lock.unlock();
            }
        }
    }
}
