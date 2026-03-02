/**
 * =========================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * This class demonstrates dynamic selection of palindrome
 * validation algorithms using the Strategy Design Pattern.
 *
 * Key Concepts:
 *  - Interface
 *  - Polymorphism
 *  - Strategy Pattern
 *  - Data Structures (Stack / Deque)
 *
 * @author Developer
 * @version 12.0
 */

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Input: ");
        String input = scanner.nextLine();

        // Strategy reference
        PalindromeStrategy strategy;

        // Inject strategy at runtime
        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}

/**
 * =========================================================
 * INTERFACE - PalindromeStrategy
 * =========================================================
 *
 * Defines a contract for all palindrome algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * =========================================================
 * CLASS - StackStrategy
 * =========================================================
 *
 * Stack-based palindrome validation (LIFO).
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/**
 * =========================================================
 * CLASS - DequeStrategy
 * =========================================================
 *
 * Deque-based palindrome validation.
 */
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters
        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }

        // Compare from both ends
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}