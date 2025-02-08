import java.util.Scanner;

class Question22 {
    public static void main(String[] args) {
        String[] items = {"Saree", "Shirt", "Shoes"};
        double[] prices = {5000.0, 3000.0, 4000.0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your budget: ");
        double budget = scanner.nextDouble();

        String[] purchasedItems = new String[items.length];
        int itemCount = 0;

        while (budget > 0) {
            System.out.println("\nAvailable items:");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i + 1) + ". " + items[i] + " - Rs." + prices[i]);
            }

            System.out.print("Select an item to purchase (enter the number): ");
            int choice = scanner.nextInt() - 1;

            if (choice < 0 || choice >= items.length) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            if (budget >= prices[choice]) {
                budget -= prices[choice];
                purchasedItems[itemCount++] = items[choice];
                System.out.println("You purchased " + items[choice] + " for Rs." + prices[choice] + ". Remaining budget: Rs." + budget);
            } else {
                System.out.println("Insufficient budget. Please select a different item.");
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
        System.out.println("\nRemaining budget: Rs." + budget);
    }
}
