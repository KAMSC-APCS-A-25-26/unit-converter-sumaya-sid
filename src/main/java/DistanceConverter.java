import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args){
        // Read in scanner
        Scanner scan = new Scanner(System.in);

        // TODO: Implement distance converter
        // Requirements:
        boolean run = true;
        // - Loop until user chooses to exit
        while (run) {

            // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
            System.out.println();
            System.out.println("Choose conversion direction:");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit");
            System.out.println();

            // User enters choice
            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter distance in miles: ");
                    double miles1 = scan.nextDouble();
                    if (miles1 == 0)
                    {
                        System.out.println("Invalid distance value.");
                    }
                    else {
                        // - Use conversion factor: 1 mile = 1.60935 kilometers
                        double kilo1 = miles1 * 1.60935;
                        System.out.println();
                        // - Display conversion results
                        System.out.println("Conversion Results:");
                        System.out.println("Miles: " + miles1);
                        System.out.println("Kilometers: " + kilo1);
                    }
                    break;
                case 2:
                    System.out.print("Enter distance in kilometers: ");
                    double kilo2 = scan.nextDouble();
                    if (kilo2 == 0)
                    {
                        System.out.println("Invalid distance value.");
                    }
                    else {
                        // - Use conversion factor: 1 mile = 1.60935 kilometers
                        double miles2 = kilo2 * 1.60935;
                        System.out.println();
                        // - Display conversion results
                        System.out.println("Conversion Results:");
                        System.out.println("Kilometers: " + kilo2);
                        System.out.println("Miles: " + miles2);
                    }
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

            }
        }
    }
}