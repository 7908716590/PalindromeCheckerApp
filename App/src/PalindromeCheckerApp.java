import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "noon";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for(char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare original string with stack pop
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("Is Palindrome: true");
        } else {
            System.out.println("Is Palindrome: false");
        }
    }
}