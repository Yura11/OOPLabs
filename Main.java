import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static double calculateR(double a, double x, double b){
        double r = (x * x) * (x + 1) /  Math.pow(Math.sin(x + a), 2);
        return r;
    }

    public static double calculateS(double a, double x, double b){
        double s = Math.sqrt((x * b) / a) + Math.pow(Math.sin(Math.pow(x + b, 3)), 2);
        return s;
    }

    public static void printCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Current date and time: " + formattedDateTime);
    }

    public static void printResults(double a, double x, double b, double resultR, double resultS) {
        System.out.println("Input data:");
        System.out.println("a = " + a);
        System.out.println("x = " + x);
        System.out.println("b = " + b);
        System.out.println("Results:");
        System.out.println("R = " + resultR);
        System.out.println("S = " + resultS);
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        double resultR = calculateR(a, x, b);
        double resultS = calculateS(a, x, b);

        printResults(a, x, b, resultR, resultS);
        printCurrentDateTime();

        scanner.close();
    }

    public static void main(String[] args) {
        run();
    }
}
