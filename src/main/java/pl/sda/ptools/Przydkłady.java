package pl.sda.ptools;

import java.util.Scanner;

public class Przydkłady {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        if (a > b) {
                System.out.println("a is bigger than b");
            }
        if (a < b) {
                System.out.println("b is bigger than a");
            }
        if (a == b) {
                System.out.println("a is equal to b");
            }
    }


}

