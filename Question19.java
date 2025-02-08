import java.util.Scanner;

class Question19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = {"Rice", "Water Bottles", "Medicine"};
        int[] stock = {1000, 500, 200};  

        System.out.println("Relief Items and Available Stock:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + ": " + stock[i] + " units");
        }

        while (true) {
            System.out.print("\nEnter the name of the item you want to allocate (or type '0' to stop): ");
            String itemName = scanner.next();

            if (itemName.equals("0")) {
                System.out.println("Allocation stopped.");
                break;
            }

            int itemIndex = -1;
            for (int i = 0; i < items.length; i++) {
                if (items[i].equalsIgnoreCase(itemName)) {
                    itemIndex = i;
                    break;
                }
            }

            if (itemIndex == -1) {
                System.out.println("Item not found! Please try again.");
                continue;
            }

            if (stock[itemIndex] == 0) {
                System.out.println("Sorry, " + items[itemIndex] + " is out of stock.");
                continue;
            }

            System.out.print("Enter the quantity of " + items[itemIndex] + " needed: ");
            int quantityNeeded = scanner.nextInt();

            if (quantityNeeded <= stock[itemIndex]) {
                stock[itemIndex] -= quantityNeeded; 
                System.out.println(quantityNeeded + " units of " + items[itemIndex] + " allocated.");
            } else {
                System.out.println("Sorry, only " + stock[itemIndex] + " units of " + items[itemIndex] + " are available.");
                continue;  
            }

            System.out.println("\nRemaining Stock:");
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i] + ": " + stock[i] + " units");
            }

            boolean allItemsAvailable = true;
            for (int i = 0; i < stock.length; i++) {
                if (stock[i] == 0) {
                    allItemsAvailable = false;
                    break;
                }
            }

            if (!allItemsAvailable) {
                System.out.println("\nAllocation stopped because, item is out of stock.");
                break;
            }
        }
    }
}
