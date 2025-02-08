import java.util.Scanner;

class Question30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjectNames = {"Math", "Science", "English", "History", "Geography"};
        int numStudents = 3;  
        
        int[] student1 = new int[subjectNames.length];
        int[] student2 = new int[subjectNames.length];
        int[] student3 = new int[subjectNames.length];

        System.out.println("Enter marks for Student 1:");
        for (int i = 0; i < subjectNames.length; i++) {
            System.out.print("Enter marks for " + subjectNames[i] + ": ");
            student1[i] = scanner.nextInt();
        }

        System.out.println("\nEnter marks for Student 2:");
        for (int i = 0; i < subjectNames.length; i++) {
            System.out.print("Enter marks for " + subjectNames[i] + ": ");
            student2[i] = scanner.nextInt();
        }

        System.out.println("\nEnter marks for Student 3:");
        for (int i = 0; i < subjectNames.length; i++) {
            System.out.print("Enter marks for " + subjectNames[i] + ": ");
            student3[i] = scanner.nextInt();
        }

        int student1Total = calculateTotalMarks(student1);
        double student1Average = calculateAverageMarks(student1Total);

        int student2Total = calculateTotalMarks(student2);
        double student2Average = calculateAverageMarks(student2Total);

        int student3Total = calculateTotalMarks(student3);
        double student3Average = calculateAverageMarks(student3Total);
        
        highesTotalMark(student1Total, student2Total, student3Total);

        // Step 5: Display the results for all students
        System.out.println("\nStudent 1 Results:");
        System.out.println("Total Marks: " + student1Total);
        System.out.println("Average Marks: " + student1Average);

        System.out.println("\nStudent 2 Results:");
        System.out.println("Total Marks: " + student2Total);
        System.out.println("Average Marks: " + student2Average);

        System.out.println("\nStudent 3 Results:");
        System.out.println("Total Marks: " + student3Total);
        System.out.println("Average Marks: " + student3Average);
        
    }

	public static void highesTotalMark(int student1Total, int student2Total, int student3Total) {
        int highestTotalMarks = student1Total;
        int topStudentIndex = 1;

        if (student2Total > highestTotalMarks) {
            highestTotalMarks = student2Total;
            topStudentIndex = 2;
        }

        if (student3Total > highestTotalMarks) {
            highestTotalMarks = student3Total;
            topStudentIndex = 3;
        }

        System.out.println("\nStudent with the highest total marks is Student " + topStudentIndex + " with " + highestTotalMarks + " marks.");
    }

    public static int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public static double calculateAverageMarks(int totalMarks) {
        return totalMarks / 5.0; 
    }
}
