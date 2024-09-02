import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalMarks = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            totalMarks += s.nextInt();
        }
    
        int average = totalMarks / 5;

        char grade;
        if (average >= 90) {
            grade = 'X';
        } else if (average >= 80) {
            grade = 'A';
        } else if (average >= 70) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks +" Out of 500");
        System.out.println("Grade: " + grade);
    }
}
