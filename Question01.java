import java.util.Scanner;

class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        String[] studentNames = new String[numStudents];

        int[] marks1 = new int[numStudents];
        int[] marks2 = new int[numStudents];
        int[] marks3 = new int[numStudents];
        int[] marks4 = new int[numStudents];
        int[] marks5 = new int[numStudents];
        int[] totalMarks = new int[numStudents];
        double[] averageMarks = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.next();
            System.out.println("Enter marks for " + studentNames[i] + ":");
            System.out.print("Subject 1: ");
            marks1[i] = scanner.nextInt();
            System.out.print("Subject 2: ");
            marks2[i] = scanner.nextInt();
            System.out.print("Subject 3: ");
            marks3[i] = scanner.nextInt();
            System.out.print("Subject 4: ");
            marks4[i] = scanner.nextInt();
            System.out.print("Subject 5: ");
            marks5[i] = scanner.nextInt();

           
            totalMarks[i] = total(marks1[i], marks2[i], marks3[i], marks4[i], marks5[i]);
            averageMarks[i] = average(totalMarks[i]);
            grades[i] = grade(averageMarks[i]);
        }

		System.out.println("\nResults:");
		for (int i = 0; i < studentNames.length; i++) {
			System.out.println("Student: " + studentNames[i]);
			System.out.println("Total Marks: " + totalMarks[i]);
			System.out.println("Average Marks: " + averageMarks[i]);
			System.out.println("Grade: " + grades[i]);
			System.out.println();
		}
    }

    public static int total(int mark1, int mark2, int mark3, int mark4, int mark5) {
		
        return mark1 + mark2 + mark3 + mark4 + mark5;
    }

    public static double average(int totalMarks) {
		
        return totalMarks / 5.0;
    }

    public static char grade(double averageMarks) {
		
        if (averageMarks >= 90) {
            return 'A';
        } else if (averageMarks >= 80) {
            return 'B';
        } else if (averageMarks >= 70) {
            return 'C';
        } else if (averageMarks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
