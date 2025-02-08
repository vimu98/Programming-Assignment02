import java.util.Scanner;

class Question21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vehicleTypes = {"Car", "Van", "Lorry"};
        double[] mileages = {15.0, 10.0, 5.0}; 

        for (int i = 0; i < vehicleTypes.length; i++) {
            System.out.print("Enter the distance traveled by " + vehicleTypes[i] + " (in km): ");
            double distance = scanner.nextDouble();
            
            double fuelConsumed = calculateFuelConsumed(distance, mileages[i]);
            double fuelCost = calculateFuelCost(fuelConsumed);

            System.out.println("\nFor " + vehicleTypes[i] + ":");
            System.out.println("Fuel Consumed: " + fuelConsumed + " liters");
            System.out.println("Fuel Cost: Rs. " + fuelCost);
            System.out.println("----------------------------------------");
        }
    }
    
    public static double calculateFuelConsumed(double distance, double mileage) {
        return distance / mileage;
    }
    
    public static double calculateFuelCost(double fuelConsumed) {
        final double costPerLiter = 450; 
        return fuelConsumed * costPerLiter;
    }

}

