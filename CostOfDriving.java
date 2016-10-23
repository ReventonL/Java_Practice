/**
 * Created by Yuxiang-Lu on 2016/10/10.
 */
import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        System.out.print("Please enter the driving distance(miles): ");
        Scanner input_distance = new Scanner(System.in);
        double distance = input_distance.nextDouble();

        System.out.print("Please enter miles per gallon: ");
        Scanner input_milesPerGallon = new Scanner(System.in);
        double milesPerGallon = input_milesPerGallon.nextDouble();

        System.out.print("Please enter price per gallon: ");
        Scanner input_pricePerGallon = new Scanner(System.in);
        double pricePerGallon = input_pricePerGallon.nextDouble();

        double costs = (distance / milesPerGallon) * pricePerGallon;
        System.out.print("The costs of driving is $" + String.format("%.2f", costs));
    }
}
