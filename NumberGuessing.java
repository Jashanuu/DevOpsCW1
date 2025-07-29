import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = 1 + rand.nextInt(100);
        int maxAttempts = 5;

        System.out.println("A number is chosen between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

        int i;
        for (i = 0; i < maxAttempts; i++) {
            System.out.print("Enter your guess: ");

            int guess;

            try {
                guess = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear the invalid input
                i--;       // Retry this attempt
                continue;
            }

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (guess > numberToGuess) {
                System.out.println("The number is smaller than " + guess);
            } else {
                System.out.println("The number is greater than " + guess);
            }
        }

        if (i == maxAttempts) {
            System.out.println("You've used all attempts. The number was " + numberToGuess);
        }

        System.out.println("Bye-bye!");
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}

