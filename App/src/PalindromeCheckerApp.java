import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reverse = "";

        // Reverse the string using for loop
        for(int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        // Compare original and reversed string
        if(input.equals(reverse)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }
    }
}