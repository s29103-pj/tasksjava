import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text 1 and text 2 using Space:");
        String line = input.nextLine();

        String[] parts = line.split(" ");
        String napis1 = parts[0];
        String napis2 = parts[1];

        System.out.println("%" + napis2 + " " + napis1 + "%");
    }
}
