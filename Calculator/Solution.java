package Calculator;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Solution {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter operator(+,-,*,/)");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        double result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result:" + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result:" + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result:" + result);
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Error:cannot divided by Zero");
            } else {
                System.out.println("Invalied operation");
            }
        }

    }

}
