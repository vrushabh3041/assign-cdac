import java.util.Scanner;

public class Q8 {
    String studentName;
    String rollNo;
    int totalMarks;

    void readData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        studentName = scanner.nextLine();

        System.out.print("Enter roll number: ");
        rollNo = scanner.nextLine();

        System.out.print("Enter total marks: ");
        totalMarks = scanner.nextInt();
        
        scanner.close();
    }

    void displayData() {
        System.out.println("Student's Name: " + studentName);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
    }

    public static void main(String[] args) {
        Q8 student = new Q8();
        student.readData();
        student.displayData();
    }
}
