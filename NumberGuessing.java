// NumberGuessing.java
// A simple number guessing game for DevOps coursework
// Includes input validation and limited number of attempts

import java.util.*;

public class NumberGuessing {

    // Function to handle the number guessing game logic
    public static void guessingNumberGame() {
        // Scanner to read user input
        final Scanner sc = new Scanner(System.in);
        
        // Generate a random number between 1 and 100
        int number = 1 + (int)(100 * Math.random());
        int attempts = 5;

        System.out.println("A number is chosen between 1 and 100.");
        System.out.println("You have " + attempts + " attempts to guess the correct number.");

        int guessCount = 0;
        while (guessCount < attempts) {
            System.out.print("Enter your guess: ");
            int guess;

            // Handle non-integer input safely
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // skip invalid input
                continue;
            }

            guess = sc.nextInt();
            guessCount++;

            // Give feedback on the guess
            if (guess == number) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (guess > number) {
                System.out.println("The number is smaller than " + guess);
            } else {
                System.out.println("The number is greater than " + guess);
            }
        }

        // If no correct guess after attempts
        if (guessCount == attempts) {
            System.out.println("You've used all attempts. The number was " + number);
        }

        System.out.println("Bye-bye!");
    }

    // Main method to run the game
    public static void main(String[] args) {
        guessingNumberGame();
    }
}
