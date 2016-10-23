/**
 * Created by Yuxiang-Lu on 2016/10/17.
 */

import java.util.Scanner;
public class RootOfQuadraticEquation {
    public static void main(String[] args) {
        System.out.print("Enter a,b,c: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double judge = Math.pow(b, 2) - 4 * a * c;
        if (judge < 0) {
            System.out.println("The equation has no real root.");
        } else if (judge == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root: " + root);
        } else {
            double root1 = ((-b) + Math.pow(judge, 0.5)) / (2 * a);
            double root2 = ((-b) - Math.pow(judge, 0.5)) / (2 * a);
            System.out.println("The equation has two roots: " + String.format("%.6f", root1) + " and " + String.format("%.6f", root2));
        }
    }

}
