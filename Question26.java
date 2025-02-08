import java.util.Scanner;

class Question26 {
    public static void main(String[] args) {
       
        String[] fireworks = {"Sparklers", "Rockets", "Firecrackers"};
        double[] prices = {20.0, 50.0, 10.0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your budget: ");
        double budget = scanner.nextDouble();

        String[] purchasedItems = new String[fireworks.length];
        int itemCount = 0;

        while (budget > 0) {
            System.out.println("\nAvailable fireworks:");
            for (int i = 0; i < fireworks.length; i++) {
                System.out.println((i + 1) + ". " + fireworks[i] + " - Rs." + prices[i]);
            }

            System.out.print("Select a firework to purchase (enter the number): ");
            int choice = scanner.nextInt() - 1;

            if (choice < 0 || choice >= fireworks.length) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            if (budget >= prices[choice]) {
                budget -= prices[choice];
                purchasedItems[itemCount++] = fireworks[choice];
                System.out.println("You purchased " + fireworks[choice] + " for Rs." + prices[choice] + ". Remaining budget: Rs." + budget);
            } else {
                System.out.println("Insufficient budget. Please select a different firework.");
            }

            System.out.print("Do you want to continue purchasing? (yes/no): ");
            String continueShopping = scanner.next().toLowerCase();
            if (!continueShopping.equals("yes")) {
                break;
            }
        }

        System.out.print("\nPurchased items: ");
        for (int i = 0; i < itemCount; i++) {
            System.out.print(purchasedItems[i] + (i < itemCount - 1 ? ", " : ""));
        }
        System.out.println("\nRemaining budget: Rs." +  budget);
    }
}
