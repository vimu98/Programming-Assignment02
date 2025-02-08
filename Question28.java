import java.util.Scanner;

class Question28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] employeeNames = {"Vimukthi", "Pasan", "Amal", "Kushan", "Sahan"};
        double[] salaries = {50000, 60000, 45000, 70000, 55000};

        String[] performanceRatings = new String[employeeNames.length];
        for (int i = 0; i < employeeNames.length; i++) {
            System.out.print("Enter the performance rating for " + employeeNames[i] + " (excellent/good): ");
            performanceRatings[i] = scanner.next();
        }

        for (int i = 0; i < employeeNames.length; i++) {
            double bonus = calculateBonus(salaries[i], performanceRatings[i]);
            double totalSalary = salaries[i] + bonus;
            System.out.println("\nEmployee: " + employeeNames[i]);
            System.out.println("Bonus: Rs. " + bonus);
            System.out.println("Total Salary: Rs. " + totalSalary);
        }
    }

    public static double calculateBonus(double salary, String rating) {
        double bonus = 0;
        if (rating.equalsIgnoreCase("excellent")) {
            bonus = salary * 0.20;  
        } else if (rating.equalsIgnoreCase("good")) {
            bonus = salary * 0.10;  
        }
        return bonus;
    }
}
