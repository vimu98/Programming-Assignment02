import java.util.Scanner;

class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of mangoes bought: ");
        int mangoesBought = scanner.nextInt();
        
        System.out.print("Enter the buying price per mango: ");
        double buyingPrice = scanner.nextDouble();
        
        System.out.print("Enter the selling price per mango: ");
        double sellingPrice = scanner.nextDouble();
        
        double profitOrLoss = calculateProfitOrLoss(mangoesBought, buyingPrice, sellingPrice);
        
        if (profitOrLoss > 0) {
            System.out.printf("You made a profit of Rs. " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.printf("You incurred a loss of Rs. " + Math.abs(profitOrLoss));
        } else {
            System.out.println("No profit, no loss.");
        }
    }
    
       
    public static double calculateProfitOrLoss(int mangoesBought, double buyingPrice, double sellingPrice) {
        double totalBuyingCost = mangoesBought * buyingPrice;
        double totalSellingPrice = mangoesBought * sellingPrice;
        return totalSellingPrice - totalBuyingCost;
    }
}
