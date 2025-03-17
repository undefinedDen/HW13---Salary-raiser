package app.utils;

import app.controller.AppController;

public class AppStarter {
    public static void startApp() {
        AppController controller = new AppController();
        controller.getOutput();
    }
}
