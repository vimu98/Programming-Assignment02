import java.util.Scanner;

class Question03 {

	public static void main(String[] args) {
       
        String[] dishes = {"Kottu", "Hoppers", "String Hoppers", "Rice and Curry", "Pittu"};
		double[] prices = {600.00, 50.00, 200.00, 500.00, 100.00};
		
		calculateBill(dishes, prices);
       
    }
    public static void calculateBill(String [] dishes, double [] prices){
		Scanner scanner = new Scanner(System.in);
		
		double totalBill = 0;
	
        while (true) {
           
            System.out.println("\nMenu:");
            for (int i = 0; i < dishes.length; i++) {
                System.out.println((i + 1) + ". " + dishes[i] + " - Rs. " + prices[i]);
            }

            System.out.println("Enter 0 to exit: ");
            System.out.print("Enter the number of the dish to order (or 0 to finish): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break; 
            }

            if (choice < 1 || choice > dishes.length) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.print("Enter the quantity for " + dishes[choice - 1] + ": ");
            int quantity = scanner.nextInt();

            if (quantity <= 0) {
                System.out.println("Please enter a valid quantity.");
                continue;
            }
           
            totalBill += prices[choice - 1] * quantity;
            System.out.println(quantity + " " + dishes[choice - 1] + "(s) added to your order.");
        }
                
        double serviceCharge = totalBill * 0.10;
        double finalBill = totalBill + serviceCharge;

        System.out.println("\n----- Final Bill -----");
        System.out.println("Subtotal: Rs. "+ totalBill);
        System.out.println("Service Charge (10%): Rs. "+ serviceCharge);
        System.out.println("Total Amount: Rs. "+ finalBill);
		
		}
}
