import java.util.Scanner;

class Question29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] candidateNames = {"Vimukthi", "Sahan", "Amila", "Kushan"};
        int[] voteCounts = new int[candidateNames.length];

        int totalVotes = 0;  
        boolean votingActive = true;

        while (votingActive && totalVotes < 100) {
            System.out.println("Enter the candidate's name (or type 'end' to stop):");
            String candidate = scanner.next();

            if (candidate.equalsIgnoreCase("end")) {
                votingActive = false;
                break;
            }

            boolean validCandidate = false;
            for (int i = 0; i < candidateNames.length; i++) {
                if (candidate.equalsIgnoreCase(candidateNames[i])) {
                    voteCounts[i]++;
                    totalVotes++;
                    validCandidate = true;
                    System.out.println("Vote for " + candidateNames[i] + " has been counted.");
                    break;
                }
            }

            if (!validCandidate) {
                System.out.println("Invalid candidate name. Please try again.");
            }

            if (totalVotes >= 100) {
                votingActive = false;
            }
        }

        displayTotalVotes(totalVotes); 
        highestVote(candidateNames, voteCounts); 
    }

    public static void displayTotalVotes(int totalVotes) {
        System.out.println("\nVoting has ended.");
        System.out.println("Total votes cast: " + totalVotes);
    }
    
    public static void highestVote(String[] candidateNames, int[] voteCounts) {
        int maxVotes = 0;
        String winner = "";
        for (int i = 0; i < candidateNames.length; i++) {
            if (voteCounts[i] > maxVotes) {
                maxVotes = voteCounts[i];
                winner = candidateNames[i];
            }
        }

        System.out.println("The candidate with the highest votes is " + winner + " with " + maxVotes + " votes.");
    }
}
