package practice;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencySymbolAndFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("es" ,"in"));
        String india = formatter.format(payment);
        NumberFormat formatter1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = formatter1.format(payment);
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = formatter2.format(payment);
        NumberFormat formatter3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formatter3.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}