import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("input Fahrenheit");
                    double f = scanner.nextDouble();
                    System.out.println(FahrenheitToCelsius(f));
                    break;
                case 2:
                    System.out.println("input Celsius");
                    double c = scanner.nextDouble();
                    System.out.println(CelsiusToFahrenheit(c));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);


    }

    public static double CelsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double FahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
