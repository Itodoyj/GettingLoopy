import java.util.Scanner;
public class CtoF_Convert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        do {
            System.out.print("Enter a temperature in Celsius: ");

            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter a temperature in Celsius: ");
                scanner.next();
            }

            celsius = scanner.nextDouble();

            if (celsius < -273.15) {
                System.out.println("Invalid input. Temperature cannot be below absolute zero (-273.15°C).");
            }
        } while (celsius < -273.15);

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheit + "°F");

        scanner.close();
    }
}