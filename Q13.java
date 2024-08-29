public class Q13 {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "apple", "orange", "banana", "grape"};

        System.out.println("Duplicated Strings:");
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    System.out.println(strings[i]);
                    break;  
                }
            }
        }
    }
}
