import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Random String Matcher!");
        System.out.println("You can enter a string, and the program will try to randomly generate it.");
        System.out.println("Type 'exit' to quit the program at any time.\n");

            // Get user input
            System.out.print("Enter a string (or type 'exit' to quit): ");
            String userInput = scanner.nextLine();

            System.out.println("This may take a while as we process your word, in the meantime please feel free to take a look at some of our posters in AR");

            // Check if the user wants to exit
            if (!userInput.equalsIgnoreCase("exit")) {

                int length = userInput.length();
                int attempts = 0;

                // Characters to use for generating random strings
                String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

                String generatedString = "";
                while (!generatedString.equals(userInput)) {
                    generatedString = generateRandomString(random, characters, length);
                    attempts++;
                }

                // Output the result
                System.out.println("\nGenerated string: " + generatedString);
                System.out.println("--------------------------");
                System.out.println("Attempts taken to match the string: " + attempts + "\n");
                System.exit(0);
            }
            else {
                System.out.println("Thank you for using the Random String Matcher! Goodbye!");
                System.exit(0);
            }

    }

    private static String generateRandomString(Random random, String characters, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}