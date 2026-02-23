public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while(start < end) {
            if(chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome) {
            System.out.println("Is Palindrome: true");
        } else {
            System.out.println("Is Palindrome: false");
        }
    }
}