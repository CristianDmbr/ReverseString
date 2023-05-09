import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {

        while (true) {
            Scanner input = new Scanner(System.in);

            // Get input string from user
            System.out.print("Enter a string you want to reverse: ");
            String str = input.nextLine();

            // Use StringBuilder class to reverse the string
            StringBuilder reversed = new StringBuilder(str);
            reversed.reverse();

            // Output the reversed string
            System.out.println("Reversed string: " + reversed.toString());

            Thread.sleep(1000);

            System.out.println("Do you want to reverse another String ? (Yes or No) ");
            Scanner decision = new Scanner(System.in);
            String yesORno = decision.nextLine();

            // In case the client enters "No"
            if (yesORno.equals("No")||yesORno.equals("no")) {
                Thread.sleep(1000);
                System.out.println("Exiting program");
                break;
            }
        }
    }
}
