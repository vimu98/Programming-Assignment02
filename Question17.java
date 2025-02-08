import java.util.Scanner;

class Question17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Rice Cooker", "Blender", "Toaster", "Microwave", "Refrigerator"};
        double[] prices = {3500, 2000, 1500, 4500, 12000};

        System.out.println("Available Products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - Rs. " + prices[i]);
        }

        String[] cart = new String[5]; 
        int[] quantities = new int[5];
        int cartIndex = 0; 

        while (true) {
            System.out.print("\nEnter product number to add to your cart (0 to stop):");
            int productNum = scanner.nextInt();

            if (productNum == 0) {
                break;  
            }

            if (productNum < 1 || productNum > products.length) {
                System.out.print("Invalid product number! Please try again.");
                continue;
            }

            System.out.println("Enter quantity for " + products[productNum - 1] + ":");
            int quantity = scanner.nextInt();

            cart[cartIndex] = products[productNum - 1];
            quantities[cartIndex] = quantity;
            cartIndex++;
        }

        double totalCost = calculateTotalCost(prices, quantities, cartIndex);

        totalCost = applyDiscount(totalCost);

        System.out.println("\nFinal Bill:");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < cartIndex; i++) {
            System.out.println(cart[i] + " - Quantity: " + quantities[i] + " - Price: Rs. " + prices[i] * quantities[i]);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Total Cost: Rs. " + totalCost);

    }
    
    public static double calculateTotalCost(double[] prices, int[] quantities, int cartIndex) {
        double totalCost = 0;
        for (int i = 0; i < cartIndex; i++) {
            totalCost += prices[i] * quantities[i];
        }
        return totalCost;
    }
    
    
    public static double applyDiscount(double totalCost) {
        if (totalCost > 5000) {
            totalCost = totalCost - (totalCost * 0.05); 
        }
        return totalCost;
    }
}
