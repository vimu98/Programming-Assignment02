import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] busNumbers = new String[5];
        String[] departureTimes = new String[5];

        for (int i = 0; i < busNumbers.length; i++) {
            System.out.print("Enter bus number: ");
            busNumbers[i] = scanner.next();
            System.out.print("Enter departure time: ");
            departureTimes[i] = scanner.next();
        }

		System.out.println("Bus Number\tDeparture Time");
        for (int i = 0; i < busNumbers.length; i++) {
            System.out.println(busNumbers[i] + "\t\t" + departureTimes[i]);
        }

        System.out.print("Enter bus number to search: ");
        String busNumberToSearch = scanner.next();
        searchBus(busNumbers, departureTimes, busNumberToSearch);
   
    }

    public static void searchBus(String[] busNumbers, String[] departureTimes, String busNumberToSearch) {
        boolean found = false;
        for (int i = 0; i < busNumbers.length; i++) {
            if (busNumbers[i].equals(busNumberToSearch)) {
                System.out.println("Bus Number: " + busNumbers[i] + ", Departure Time: " + departureTimes[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Bus number " + busNumberToSearch + " not found.");
        }
    }
}
