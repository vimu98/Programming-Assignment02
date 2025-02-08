import java.util.Scanner;

class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = new String[6];
        double[] marks = new double[6];

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter subject name: ");
            subjects[i] = scanner.next();
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = scanner.nextDouble();
            System.out.println();
        }

        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        
        double averageMarks = totalMarks / subjects.length;

        String passFailStatus = "Pass";
        for (double mark : marks) {
            if (mark < 40) {
                passFailStatus = "Fail";
                break;
            }
        }
        
        System.out.println("Subject\tMarks");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + "\t" + marks[i]);
        }
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Pass/Fail Status: " + passFailStatus);
    }
}
