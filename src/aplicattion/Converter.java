package aplicattion;

import utilities.DolarConverter;

import java.util.Locale;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of Dollar today: ");
        double dollarToday = sc.nextDouble();
        System.out.print("How much do you need dollars: ");
        double dollars = sc.nextDouble();
        System.out.printf("Total in reais needed to buy %.2f$ dollars: %.2fR$ %n",dollars, DolarConverter.converter(dollarToday, dollars));
        sc.close();
    }
}