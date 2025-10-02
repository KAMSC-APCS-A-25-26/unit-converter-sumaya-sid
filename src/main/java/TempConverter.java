import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // Read in scanner
        Scanner scan = new Scanner(System.in);
        // TODO: Implement temperature converter
        // Requirements:
        boolean run = true;
        final double C_CONVERSION = 5.0 / 9.0;
        final double F_CONVERSION = 9.0 / 5.0;

        // - Loop until user chooses to exit
        while (run) {

            // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
            System.out.println();
            System.out.println("Choose conversion direction:");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = scan.nextInt();

            // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit1 = scan.nextDouble();

                    double celsius1 = (fahrenheit1 - 32) * C_CONVERSION;
                    System.out.println();
                    System.out.println("Conversion Results: ");
                    System.out.println("Fahrenheit: " + fahrenheit1);
                    System.out.println("Celsius: " + celsius1);
                    break;
                case 2:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius2 = scan.nextDouble();

                    double fahrenheit2 = celsius2 * F_CONVERSION + 32;
                    System.out.println();
                    System.out.println("Conversion Results: ");
                    System.out.println("Celsius: " + celsius2);
                    System.out.println("Fahrenheit: " + fahrenheit2);
                    break;

                case 3:
                    // - Loop until user chooses to exit
                    System.out.println();
                    System.out.print("Goodbye!");
                    run = false;
                    break;

                // - Handle invalid menu choices
                default:
                    System.out.println("Invalid choice.");
                    System.out.println("Enter a valid choice: ");
                    break;

            }
        }
    }
}