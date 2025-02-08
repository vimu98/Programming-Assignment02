import java.util.Scanner;

class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of reloads: ");
        int reloads = scanner.nextInt();
        double[] reloadAmounts = new double[reloads];
        
        for (int i = 0; i < reloads; i++) {
            System.out.print("Enter reload amount " + (i + 1) + ": ");
            reloadAmounts[i] = scanner.nextDouble();
        }

        double totalReloads = calculateTotalReloads(reloadAmounts);
        double largestReload = findLargestReload(reloadAmounts);

        System.out.println("Total Reloads: " + totalReloads);
        System.out.println("Largest Reload: " + largestReload);
    }

    public static double calculateTotalReloads(double[] reloadAmounts) {
        double total = 0;
        for (double amount : reloadAmounts) {
            total += amount;
        }
        return total;
    }

    public static double findLargestReload(double[] reloadAmounts) {
        double largest = reloadAmounts[0];
        for (double amount : reloadAmounts) {
            if (amount > largest) {
                largest = amount;
            }
        }
        return largest;
    }
}
