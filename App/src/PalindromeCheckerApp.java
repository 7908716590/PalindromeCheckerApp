/**
 * MAIN CLASS – UseCase2PalindromeCheckerApp
 *
 * Use Case 2: Hardcoded Palindrome Validation
 * @author Developer
 * @version 2.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}