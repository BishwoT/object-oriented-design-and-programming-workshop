package workshop1;

import java.util.Scanner;

public class qn5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of one side of the square: ");
        double side = scanner.nextDouble();

        double area = side * side;

        System.out.println("The area of the square is: " + area);

        scanner.close();
    }
}

