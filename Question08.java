import java.util.Random;
import java.util.Scanner;

class Question08 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       
        int winningNumber = random.nextInt(50) + 1;
        int guess;
        boolean status = false;
        System.out.println("Guess a number between 1 and 50.");
        System.out.println("Enter 0 to exit.");
        System.out.println();

        while (!status) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == 0) {
                System.out.println("You exit the game. The winning number is: " + winningNumber);
                break;
            }

            if (guess == winningNumber) {
                status = true;
                System.out.println("Congratulations! You guessed the correct number.");
            } else {
                System.out.println("Wrong guess. Try again!");
            }
        }

        if (status) {
            System.out.println("The winning number is: " + winningNumber);
        }
    }
}
