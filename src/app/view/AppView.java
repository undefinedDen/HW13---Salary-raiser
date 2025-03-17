package app.view;

import app.utils.Constants;

import java.util.Scanner;

public class AppView {
    public <T> void getDisplayInfo(T output) {
        System.out.println(output);
    }

    public String inputRaise() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Constants.RAISE);
        return scanner.nextLine();
    }
}
