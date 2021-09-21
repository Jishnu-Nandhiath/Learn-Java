package com.practice;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbersClass {

    public static void main(String[] args) {

        double doubleValue = 121324324.23;

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(doubleValue));

        NumberFormat intFormat = NumberFormat.getIntegerInstance();
        System.out.println(intFormat.format(doubleValue));

        Locale locale = new Locale("en","IN");
        NumberFormat localeFormat = NumberFormat.getNumberInstance(locale);
        System.out.println(localeFormat.format(doubleValue));

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormat.format(doubleValue));

        DecimalFormat decimalFormat = new DecimalFormat("$000.000");
        System.out.println(decimalFormat.format(1));

    }
}
