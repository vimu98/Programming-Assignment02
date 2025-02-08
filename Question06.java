import java.util.Scanner;

class Question06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance traveled (in km): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the waiting time (in minutes): ");
        int waitingTime = scanner.nextInt();

        double fare = calculateFare(distance, waitingTime);
        
        System.out.println("\nTotal Fare: Rs." + fare);
    }

    public static double calculateFare(double distance, int waitingTime) {
        double fare = (distance * 50) + (waitingTime * 2);
        return fare;
    }
}
