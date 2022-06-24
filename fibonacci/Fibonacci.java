package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int number) {
        int num1 = 0, num2 = 1, counter = 0;
        System.out.println("Fibonacci Number:");
        while (counter < number) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scan.nextInt();
        fibonacci(number);
    }
}
