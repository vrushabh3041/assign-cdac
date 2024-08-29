public class Q1 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;

        for (String arg : args) {
            int number = Integer.parseInt(arg);
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Maximum number is: " + max);
    }
}
