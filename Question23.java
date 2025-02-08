import java.util.Scanner;

class Question23 {
    public static void main(String[] args) {
       
        String[] destinations = {"Ella", "Sigiriya", "Nuwara Eliya"};
        double[] costs = {150.0, 200.0, 180.0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your total budget: ");
        double budget = scanner.nextDouble();

        String[] selectedDes = new String[destinations.length];
        int destinationCount = 0;

        while (budget > 0) {
            System.out.println("\nAvailable destinations within your budget:");
            boolean afford = false;
            for (int i = 0; i < destinations.length; i++) {
                if (budget >= costs[i]) {
                    System.out.println((i + 1) + ". " + destinations[i] + " - Rs." + costs[i]);
                    afford = true;
                }
            }

            if (!afford) {
                System.out.println("No more destinations can be afforded within your budget.");
                break;
            }

            System.out.print("Select a destination to purchase (enter the number): ");
            int choice = scanner.nextInt() - 1;

            if (choice < 0 || choice >= destinations.length) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            if (budget >= costs[choice]) {
                budget -= costs[choice];
                selectedDes[destinationCount++] = destinations[choice];
                System.out.println("You selected " + destinations[choice] + " for Rs." + costs[choice] + ". Remaining budget: Rs." + budget);
            } else {
                System.out.println("Insufficient budget. Please select a different destination.");
            }

            System.out.print("Do you want to continue selecting destinations? (yes/no): ");
            String continueSelecting = scanner.next().toLowerCase();
            if (!continueSelecting.equals("yes")) {
                break;
            }
        }

        System.out.print("\nSelected destinations: ");
        for (int i = 0; i < destinationCount; i++) {
            System.out.print(selectedDes[i] + (i < destinationCount - 1 ? ", " : ""));
        }
        System.out.println("\nRemaining budget: Rs." + budget);
    }
}
