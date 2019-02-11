package ee.taltech.itcolledge.groups;

import java.util.Scanner;

public class ProfitCalculator {

    public static void main(String[] args) {
        // todo using example in group divisor create a program to calculate return on investment (ROI)
        System.out.println("Insert the initial investment");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int investment = Integer.parseInt(line);
        System.out.println("Insert the expected return a year %");
        line = sc.nextLine();
        int percentage = Integer.parseInt(line);

        double profit = (double) investment * (double) percentage * .01;
        double total = profit + investment;

        System.out.println(String.format("You get %.2f money back, out of which %.2f. is pure profit", total, profit));
    }
}