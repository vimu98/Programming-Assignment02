import java.util.Scanner;

class Question05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.println();

        String[] playerNames = new String[numPlayers];
        int[] playerScores = new int[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter player name: ");
            playerNames[i] = scanner.next();
            System.out.print("Enter score for " + playerNames[i] + ": ");
            playerScores[i] = scanner.nextInt();
            System.out.println();
        }

        findHighestScorer(playerNames, playerScores);
        calculateTotalAndAverage(playerScores);
        displayScorecard(playerNames, playerScores);

        scanner.close();
    }

    public static void findHighestScorer(String[] names, int[] scores) {
        int maxScore = scores[0];
        String highestScorer = names[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                highestScorer = names[i];
            }
        }

        System.out.println("\nHighest Scorer: " + highestScorer + " with " + maxScore);
    }

    public static void calculateTotalAndAverage(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }

        double average = (double) total / scores.length;
        System.out.println("\nTotal Team Score: " + total);
        System.out.println("Average Score: " + average);
    }
    
    public static void displayScorecard(String[] names, int[] scores) {
        System.out.println("\nScorecard:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " : " + scores[i]);
        }
    }
}
