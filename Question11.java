import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        int[] seats = new int[50];
        Scanner scanner = new Scanner(System.in);
        int bookedSeats = 0;

        System.out.println("Welcome to the Bus Seat Reservation System");
        
        while (bookedSeats < 50) {
            displayAvailableSeats(seats);
            
            System.out.print("Enter seat number to book (1-50): ");
            int seatNumber = scanner.nextInt();

            if (seats[seatNumber - 1] == 1) {
                System.out.println("Seat " + seatNumber + " is already booked. Please choose another seat.");
            } else {
                seats[seatNumber - 1] = 1; 
                bookedSeats++;
                System.out.println("Seat " + seatNumber + " successfully booked!");
            }
        }
        
        System.out.println("All seats are now booked. Thank you!");
        scanner.close();
    }
    
    public static void displayAvailableSeats(int[] seats) {
        System.out.println("\nAvailable seats:");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }
}
