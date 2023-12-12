package InterviewPrograms;

public class ReverseStringAndWords {

    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }

        char[] inputArray = input.toCharArray();
        int start = 0;
        int end = inputArray.length - 1;

        while (start < end) {
            char temp = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = temp;
            start++;
            end--;
        }

        return new String(inputArray);
    }

    public static String reverseWords(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }

        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, this is a simple Java program.";

        String reversedString = reverseString(input);
        System.out.println("Reversed String: " + reversedString);
        String reversedWords = reverseWords(input);
        System.out.println("Reversed Words: " + reversedWords);
    }
}