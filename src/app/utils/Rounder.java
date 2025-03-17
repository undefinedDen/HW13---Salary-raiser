package app.utils;

import java.text.DecimalFormat;

public class Rounder {
    public static String round(double data){
        return new DecimalFormat("0.00").format(data);
    }
}
