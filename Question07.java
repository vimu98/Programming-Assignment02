import java.util.Scanner;

class Question07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] temps = new double[7];

        System.out.println("Enter the temperatures for the week:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temps[i] = scanner.nextDouble();
        }

        double average = calculateAverage(temps);
        double highest = findHighest(temps);
        double lowest = findLowest(temps);

        System.out.println();
        System.out.println("Average Temperature: " + average + "C");
        System.out.println("Highest Temperature: " + highest + "C");
        System.out.println("Lowest Temperature: " + lowest + "C");

    }

    public static double calculateAverage(double[] temps) {
        double sum = 0;
        for (double temp : temps) {
            sum += temp;
        }
        return sum / temps.length;
    }

    public static double findHighest(double[] temps) {
        double highest = temps[0];
        for (double temp : temps) {
            if (temp > highest) {
                highest = temp;
            }
        }
        return highest;
    }

    public static double findLowest(double[] temps) {
        double lowest = temps[0];
        for (double temp : temps) {
            if (temp < lowest) {
                lowest = temp;
            }
        }
        return lowest;
    }
}
