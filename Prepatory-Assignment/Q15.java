import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] occurrences = new int[26];  // Array to hold the count of each alphabet letter

        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                occurrences[ch - 'a']++;
            }
        }

        System.out.println("Alphabet occurrences:");
        for (int i = 0; i < 26; i++) {
            if (occurrences[i] > 0) {
                System.out.println((char) (i + 'A') + " : " + occurrences[i]);
            }
        }
    }
}
