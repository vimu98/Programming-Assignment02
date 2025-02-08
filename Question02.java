import java.util.Scanner;

class Question02 {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
   
        String[] destinations = {"Colombo", "Kandy", "Jaffna"};

        int[] seatCounts = {5, 5, 5}; 


        while (true) {
            
            System.out.println("\nAvailable Destinations and Seats:");
            for (int i = 0; i < destinations.length; i++) {
                System.out.println((i + 1) + ". " + destinations[i] + " - " + seatCounts[i] + " seats available");
            }

            
            boolean allBooked = true;
            for (int seats : seatCounts) {
                if (seats > 0) {
                    allBooked = false;
                    break;
                }
            }

            if (allBooked) {
                System.out.println("All seats are fully booked!");
                break;
            }

           
            System.out.print("Enter the number of the destination to book : ");
            int choice = scanner.nextInt();

            if (choice < 1 || choice > destinations.length) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            int index = choice - 1;

            System.out.print("Enter the number of seats to book for " + destinations[index] + ": ");
            int numOfSeats = scanner.nextInt();

            if (numOfSeats <= 0) {
                System.out.println("Please enter a valid number of seats.");
                continue;
            }

            if (seatCounts[index] >= numOfSeats) {
                seatCounts[index] -= numOfSeats;
                System.out.println("Booking confirmed for " + numOfSeats + " seats to " + destinations[index] + ".");
            } else {
                System.out.println("Sorry, only " + seatCounts[index] + " seats are available for " + destinations[index] + ".");
            }
        }
    }
}
