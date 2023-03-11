import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the month:");
        int monthNumber = input.nextInt();

        int daysInMonth = 0;
        String monthName = "";

        switch (monthNumber) {
            case 1:
                daysInMonth = 31;
                monthName = "Styczeń";
                break;
            case 2:
                daysInMonth = 28;
                monthName = "Luty";
                break;
            case 3:
                daysInMonth = 31;
                monthName = "Marzec";
                break;
            case 4:
                daysInMonth = 30;
                monthName = "Kwiecień";
                break;
            case 5:
                daysInMonth = 31;
                monthName = "Maj";
                break;
            case 6:
                daysInMonth = 30;
                monthName = "Czerwiec";
                break;
            case 7:
                daysInMonth = 31;
                monthName = "Lipiec";
                break;
            case 8:
                daysInMonth = 31;
                monthName = "Sierpień";
                break;
            case 9:
                daysInMonth = 30;
                monthName = "Wrzesień";
                break;
            case 10:
                daysInMonth = 31;
                monthName = "Październik";
                break;
            case 11:
                daysInMonth = 30;
                monthName = "Listopad";
                break;
            case 12:
                daysInMonth = 31;
                monthName = "Grudzień";
                break;
            default:
                System.out.println("BŁĄD: Podaj poprawny numer miesiąca (1-12).");
                System.exit(0);
        }

        System.out.println(monthName + ": " + daysInMonth + " dni.");
    }
}
