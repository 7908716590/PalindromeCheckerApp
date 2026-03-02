/**
 * =========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Compares execution time of different palindrome
 * algorithms using System.nanoTime().
 *
 * Key Concepts:
 *  - System.nanoTime()
 *  - Algorithm comparison
 *  - Performance measurement
 *
 * @author Developer
 * @version 13.0
 */

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        // ----------------------------
        // 1️⃣ Two Pointer Approach
        // ----------------------------
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(normalized);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // ----------------------------
        // 2️⃣ Stack Approach
        // ----------------------------
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(normalized);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // ----------------------------
        // 3️⃣ Deque Approach
        // ----------------------------
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(normalized);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        // ----------------------------
        // Display Results
        // ----------------------------
        System.out.println("\nResults:");
        System.out.println("----------------------------------");
        System.out.println("Two Pointer  -> " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack        -> " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque        -> " + result3 + " | Time: " + time3 + " ns");

        scanner.close();
    }

    // ✅ Two Pointer Method (Most Efficient)
    public static boolean twoPointerCheck(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // ✅ Stack Method
    public static boolean stackCheck(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // ✅ Deque Method
    public static boolean dequeCheck(String str) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}