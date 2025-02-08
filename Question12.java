import java.util.Scanner;

class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] donorNames = new String[5]; 
        double[] donationAmounts = new double[5];

        for (int i = 0; i < donorNames.length; i++) {
            System.out.print("Enter donor name: ");
            donorNames[i] = scanner.next();
            System.out.print("Enter donation amount: ");
            donationAmounts[i] = scanner.nextDouble();
            System.out.println();

        }

       
        double totalDonations = totalDonations(donationAmounts);
        System.out.println("Total Donations: " + totalDonations);

        String highestDonor = highestDonor(donorNames, donationAmounts);
        System.out.println("Highest Donor: " + highestDonor);

        displayDonors(donorNames, donationAmounts);
    }

    public static double totalDonations(double[] donations) {
        double total = 0;
        for (double donation : donations) {
            total += donation;
        }
        return total;
    }

    public static String highestDonor(String[] names, double[] donations) {
        int highest = 0;
        for (int i = 1; i < donations.length; i++) {
            if (donations[i] > donations[highest]) {
                highest = i;
            }
        }
        return names[highest];
    }

    public static void displayDonors(String[] names, double[] donations) {
        System.out.println("Donor Name\tDonation Amount");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "\t" + donations[i]);
        }
    }
}
