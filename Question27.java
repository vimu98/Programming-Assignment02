import java.util.Random;
import java.util.Scanner;

class Question27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] sinhalaWords = {"mage", "oya", "api", "innawa", "bonawa"};
        String[] tamilTranslations = {"ennudaya", "ninga", "nangal", "nikkiren", "kudikkiren"};

        int score = 0;
        for (int i = 0; i < 5; i++) {
          
            int randomIndex = random.nextInt(sinhalaWords.length);
            String sinhalaWord = sinhalaWords[randomIndex];
            String correctTamilTranslation = tamilTranslations[randomIndex];

            System.out.print("Translate the Sinhala word '" + sinhalaWord + "' into Tamil:");
            String userTranslation = scanner.nextLine();

            if (userTranslation.equalsIgnoreCase(correctTamilTranslation)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct translation is: " + correctTamilTranslation);
            }
        }

        System.out.println("\nYour final score is: " + score + " of 5.");
    }
}
