import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 number:");
        double a = input.nextDouble();

        System.out.println("Enter 2 number:");
        double b = input.nextDouble();

        double square = a * b;
        System.out.println("square:" + square);
    }
}