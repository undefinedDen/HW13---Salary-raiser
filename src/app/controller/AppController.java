package app.controller;


import app.model.AppModel;
import app.repository.EmployeeRepository;
import app.utils.Constants;
import app.view.AppView;

public class AppController{
    public void getOutput(){
        AppView view = new AppView();
        AppModel model = new AppModel();
        EmployeeRepository repository = new EmployeeRepository();

        view.getDisplayInfo(Constants.START_MSG);

        view.getDisplayInfo("Employer`s payroll:\n" +
                repository.getBob() + "\n" +
                repository.getDenys() + "\n" +
                repository.getRoman() + "\n" +
                repository.getViktoria());

        Thread bobThread = new Thread(() -> model.raiseSalary(repository.getBob()));
        Thread denysThread = new Thread(() -> model.raiseSalary(repository.getDenys()));
        Thread romanThread = new Thread(() -> model.raiseSalary(repository.getRoman()));
        Thread viktoriaThread = new Thread(() -> model.raiseSalary(repository.getViktoria()));
        bobThread.start();
        denysThread.start();
        romanThread.start();
        viktoriaThread.start();
        try {
            viktoriaThread.join();
        } catch (InterruptedException e) {
            view.getDisplayInfo(e.getMessage());
        }
        view.getDisplayInfo(Constants.FINAL_MSG);

    }
}

