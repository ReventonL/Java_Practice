/**
 * Created by Yuxiang-Lu on 2016/10/10.
 */

import java.util.Scanner;

public class CalValue {
    public static void main(String[] args) {
        System.out.print("Please enter investment amount: ");
        Scanner input_amount = new Scanner(System.in);
        double amount = input_amount.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        Scanner input_annualInterestRate = new Scanner(System.in);
        double annualInterestRate = input_annualInterestRate.nextDouble() / 100;

        System.out.print("Enter number of years: ");
        Scanner input_years = new Scanner(System.in);
        int years = input_years.nextInt();

        double calValue = (amount * Math.pow(1 + annualInterestRate / 12, years * 12));
        System.out.print("Accumulated value is $:" + String.format("%.2f", calValue));
    }
}
