import java.util.Random;
import java.util.Scanner;

class Question24 {
	public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] generatedNumbers = new int[6];
        for (int i = 0; i < generatedNumbers.length; i++) {
            generatedNumbers[i] = random.nextInt(45) + 1; 
        }

        int[] userNumbers = new int[6];
        for (int i = 0; i < userNumbers.length; i++) {
			System.out.print("Enter your number "+(i+1)+" (between 1 and 45):");
            userNumbers[i] = scanner.nextInt();
        }

        int matchingCount = 0;
        for (int i = 0; i < generatedNumbers.length; i++) {
            for (int j = 0; j < userNumbers.length; j++) {
                if (generatedNumbers[i] == userNumbers[j]) {
                    matchingCount++;
                    break;  
                }
            }
        }

        System.out.println("\nGenerated numbers: ");
        for (int num : generatedNumbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nYour numbers: ");
        for (int num : userNumbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nCount of matching numbers: " + matchingCount);
    }
}
