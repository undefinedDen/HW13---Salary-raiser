package app.validator;

import app.exception.AppException;

public class AppValidator {
    public void validationInputEmpty(String raise)throws NullPointerException {
        if(raise.trim().isEmpty()){
          //  System.out.println("Raise can not be empty");
            throw new NullPointerException("Raise can not be empty");
        }
    }
    public void validateNegativeInput(double raise)throws AppException{
        if(raise < 1){
           throw  new AppException("Raise can not be lesly than 1");
        }
    }
}
