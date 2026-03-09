import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        while (true) { // loop will not stop until u guessed right
            int computerGuess = (int)(Math.random() * (max - min + 1)) + min; // changed decimal random no to int and set range of min max
            System.out.println("Guess a number (1-100)");
            Scanner sc = new Scanner(System.in);
            int userGuess = sc.nextInt();

            System.out.print("Computer Chose:" + computerGuess); // computer random no
            System.out.println("\tYou Guess:" + userGuess); // user guess no
            int diff = (userGuess > computerGuess) ? diff = userGuess - computerGuess : computerGuess - userGuess; // conditional statement using ternary operator

            if (userGuess == computerGuess) {
                System.out.println("You guessed, Right!"); /* if user guess right!
                                                              loop will terminate */
                break;
            }
            if (diff <= 5) {
                System.out.println("Very Close");
            } else if (diff <= 10) {
                System.out.println("You're Close");
            } else {
                System.out.println("You Guessed, Wrong!");
            }
        }

    }
}
