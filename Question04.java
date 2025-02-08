import java.util.Random;
import java.util.Scanner;

class Question04 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       
        int randomNum = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        boolean guessedCorrect = false;

        System.out.println("Guess a number between 1 and 100.");
        System.out.println("Type 0 to quit the game.");

        while (!guessedCorrect) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            
            if (guess == 0) {
                System.out.println("You quit the game. The correct number is: " + randomNum);
                break;
            }

            attempts++;

            if (guess < randomNum) {
                System.out.println("Too Low!");
            } else if (guess > randomNum) {
                System.out.println("Too High!");
            } else {
                guessedCorrect = true;
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Attempts: " + attempts);
            }
        }        
    }
}
