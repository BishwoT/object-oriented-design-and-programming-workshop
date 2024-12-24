package workshop1;

import java.util.Scanner;

public class qn11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();

        double kilometers = miles * 1.60;

        System.out.println("Equivalent distance in kilometers: " + kilometers);

        scanner.close();
    }
}

