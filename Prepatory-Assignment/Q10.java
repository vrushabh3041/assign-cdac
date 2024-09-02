import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        String[] nameOfStudents = new String[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter up to 10 student names:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            nameOfStudents[i] = scanner.nextLine();
        }

        Arrays.sort(nameOfStudents);

        System.out.println("Sorted Names:");
        for (String name : nameOfStudents) {
            System.out.println(name);
        }

     
    }
}
