package app.controller;

import app.model.AppModel;
import app.repository.CustomerRepository;
import app.utils.Constants;
import app.view.AppView;

public class AppController {
    public void getOutput(){
        AppView view = new AppView();
        AppModel model = new AppModel();
        CustomerRepository repository = new CustomerRepository();
        view.getDisplayInfo(Constants.START_MSG);

    }
}
