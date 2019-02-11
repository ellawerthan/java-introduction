package ee.taltech.itcolledge.groups;

import java.util.Scanner;

public class GroupDivisor {

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println("You said your name is: " + line);

        System.out.println("---------=============---------");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Insert the number of people");
        line = sc.nextLine();
        int people = Integer.parseInt(line);
        System.out.println("Insert the group size");
        line = sc.nextLine();
        int size = Integer.parseInt(line);

        int groups = people / size;
        int leftover = people % size;

        System.out.println(String.format("You get %d full groups, leftover %d.", groups, leftover));
        System.out.println("---------=============---------");
        System.out.println("\n");
        System.out.println("\n");
    }
}
