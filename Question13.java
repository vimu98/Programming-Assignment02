import java.util.Scanner;

class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] workerNames = new String[5];
        double[] teaPick = new double[5];

        for (int i = 0; i < workerNames.length; i++) {
            System.out.print("Enter worker name: ");
            workerNames[i] = scanner.next();
            System.out.print("Enter kilograms of tea leaves picked: ");
            teaPick[i] = scanner.nextDouble();
            System.out.println();
        }

        double[] salaries = calculateSalaries(teaPick);

        displaySalaries(workerNames, salaries);
    }

    public static double[] calculateSalaries(double[] teaPick) {
        double[] salaries = new double[teaPick.length];
        for (int i = 0; i < teaPick.length; i++) {
            salaries[i] = teaPick[i] * 50;
        }
        return salaries;
    }

    public static void displaySalaries(String[] workerNames, double[] salaries) {
        System.out.println("Worker Name\tSalary");
        for (int i = 0; i < workerNames.length; i++) {
            System.out.println(workerNames[i] + "\t" + salaries[i]);
        }
    }
}
