import java.util.Scanner;

class Question25 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the electricity units consumed: ");
        int unitsConsumed = scanner.nextInt();

        double billAmount = calculateBill(unitsConsumed);

        System.out.print("Is there a late payment (yes/no)? ");
        String latePayment = scanner.next();

        if (latePayment.equalsIgnoreCase("yes")) {
            billAmount += billAmount * 0.05; 
        }

        System.out.println("\nElectricity Bill Details:");
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Rs. " + billAmount);

    }
      public static double calculateBill(int units) {
        double billAmount = 0;

        if (units <= 100) {
            billAmount = units * 7;
        }

        else if (units <= 200) {
            billAmount = 100 * 7 + (units - 100) * 10;
        }
     
        else {
            billAmount = 100 * 7 + 100 * 10 + (units - 200) * 15;
        }

        return billAmount;
    }
}
