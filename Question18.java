import java.util.Scanner;

class Question18 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] students = {"Vimukthi", "Pasan", "Sahan", "Kushan", "Amila"};
        int[] attendance = new int[students.length];

        System.out.print("Enter the total number of classes: ");
        int totalClasses = scanner.nextInt();

        for (int i = 1; i <= totalClasses; i++) {
            System.out.println("\nClass " + i + " attendance:");

            for (int j = 0; j < students.length; j++) {
                System.out.print("Is " + students[j] + " present? (Enter 'present' or 'absent'): ");
                String attendanceStatus = scanner.next();

                if (attendanceStatus.equalsIgnoreCase("present")) {
                    attendance[j]++; 
                }
            }
        }
        System.out.println();
        attendancePercentage(students, attendance, totalClasses);
        identifyLowAttendance(students, attendance, totalClasses);
    }
       
    public static void attendancePercentage(String[] students, int[] attendance, int totalClasses) {
        for (int i = 0; i < students.length; i++) {
            double percentage = ((double) attendance[i] / totalClasses) * 100;
            System.out.println(students[i] + " - Attendance Percentage: " + percentage + "%");
        }
    }

    public static void identifyLowAttendance(String[] students, int[] attendance, int totalClasses) {
        System.out.println("\nStudents with less than 75% attendance:");
        for (int i = 0; i < students.length; i++) {
            double percentage = ((double) attendance[i] / totalClasses) * 100;
            if (percentage < 75) {
                System.out.println(students[i] + " - Attendance Percentage: " + percentage + "%");
            }
        }
    }
}
