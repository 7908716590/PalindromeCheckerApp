public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";   // You can change this value

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + result);
    }

    /**
     * Recursively checks whether a string is palindrome
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base Condition 1: All characters matched
        if (start >= end) {
            return true;
        }

        // Base Condition 2: Mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Call
        return check(s, start + 1, end - 1);
    }
}