import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        // TODO: Implement time converter
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        // Requirements:
        while (run)
        {
            // - Prompt for hours, minutes, and seconds
            System.out.println("Convert time to total seconds");
            System.out.println();
            System.out.print("Enter hours: ");
            int hours = scan.nextInt();
            System.out.print("Enter minutes: ");
            int minutes = scan.nextInt();
            System.out.print("Enter seconds: ");
            int seconds = scan.nextInt();
            System.out.println();

            // Actual calculation
            int seconds1 = hours * 3600;
            int seconds2 = minutes * 60;
            int total = seconds1 + seconds2 + seconds;

            // - Display conversion results
            System.out.println("Time Conversion:");
            System.out.println("Input: " + hours + " hour, " + minutes + " minute, and " + seconds + " second");
            System.out.println("Total seconds: " + total);
            System.out.println();

            // Display calculation breakdown
            System.out.println("Calculation: ");
            System.out.println(hours + " hours x 3600 = " + seconds1 + " seconds");
            System.out.println(minutes + " minutes x 60 = " + seconds2 + " seconds");
            System.out.println(seconds + " seconds = " + seconds + " seconds");
            System.out.println("Total: " + total + " seconds");
            System.out.println();

            // - Ask user if they want to convert another time (y/n)
            System.out.print("Do you want to convert another time (y/n): ");
            char decision = scan.next().charAt(0);
            char no = 'n';
            if (decision == no)
            {
                run = false;
                System.out.println("Goodbye!");
            }
        }
        // - Loop until user chooses to exit
    }
}