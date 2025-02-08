import java.util.Random;
import java.util.Scanner;

class Question09 {
    public static void main(String[] args) {
       
        String[] zodiacAnimals = {"Lion", "Elephant", "Rabbit"};

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Sinhala and Tamil New Year Zodiac Game!");
        String playAgain;

        do {
            String selectedAnimal = zodiacAnimals[random.nextInt(zodiacAnimals.length)];

            System.out.println("A zodiac animal has been selected. Can you guess it?");
            boolean guessedCorrectly = false;

            while (!guessedCorrectly) {
                System.out.print("Enter your guess: ");
                String userGuess = scanner.next();

                if (userGuess.equalsIgnoreCase(selectedAnimal)) {
                    System.out.println("Congratulations! You guessed it right: " + selectedAnimal);
                    guessedCorrectly = true;
                } else {
                    System.out.println("Incorrect guess. Try again!");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing the Game!");  
    }
}
