import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.print("Podaj pierwszą liczbę: ");
        a = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        b = scanner.nextDouble();

        System.out.print("Podaj trzecią liczbę: ");
        c = scanner.nextDouble();

        double min, max, mid;

        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        if ((a > b && a < c) || (a < b && a > c)) {
            mid = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            mid = b;
        } else {
            mid = c;
        }

        System.out.println(min + " " + mid + " " + max);
        System.out.println(max + " " + mid + " " + min);
    }
}
