package workshop1;

import java.util.Scanner;

public class qn13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of items: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double price = scanner.nextDouble();

        double totalCost = quantity * price;

        System.out.println("The total cost is: " + totalCost);

        scanner.close();
    }
}

