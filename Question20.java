import java.util.Scanner;

class Question20 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();
        
        calculateNotes(amount);
        
    }
    
   
    public static void calculateNotes(int amount) {
       
        int[] denominations = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};
        
       
        int[] noteCount = new int[denominations.length];
        
      
        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                noteCount[i] = amount / denominations[i];
                amount = amount % denominations[i];
            }
        }
        
        System.out.println("\nMinimum Notes Required:");
        for (int i = 0; i < denominations.length; i++) {
            if (noteCount[i] > 0) {
                System.out.println("Rs. " + denominations[i] + " : " + noteCount[i] + " notes");
            }
        }
    }
}
