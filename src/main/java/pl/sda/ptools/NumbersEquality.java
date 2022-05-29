package pl.sda.ptools;

import java.util.Scanner;

public class NumbersEquality {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        if (a > b) {
            printMessageWithNewLine("a is bigger than b");
        }
        else if (a < b) {
            printMessageWithNewLine("b is bigger than a");
        }
        else {
            printMessageWithNewLine("a is equal to b");
        }
    }
    private static void printMessageWithNewLine(String message) {
        System.out.println(message);
    }

}
