/**
 * Created by Yuxiang-Lu on 2016/10/17.
 */

import java.util.Scanner;
public class CurrencyExchange {
    public static void main(String[] args) {
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        Scanner input_exchangeRate = new Scanner(System.in);
        double exchangeRate = input_exchangeRate.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        Scanner input_judge = new Scanner(System.in);
        int judge = input_judge.nextInt();
        if (judge == 0) {
            System.out.print("Enter the dollars amount: ");
            Scanner input = new Scanner(System.in);
            double amount = input.nextDouble();
            System.out.println("$" + amount + " is " + amount * exchangeRate + " yuan");
        } else if (judge == 1) {
            System.out.print("Enter the RMB amount: ");
            Scanner input = new Scanner(System.in);
            double amount = input.nextDouble();
            System.out.println(amount + " yuan is " + "$" + String.format("%.2f", amount / exchangeRate));
        } else {
            System.out.println("Incorrect input.");
        }
    }
}
