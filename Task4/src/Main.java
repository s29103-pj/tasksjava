import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b i c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("BŁĄD");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}
