Use Case Title

UC8: Palindrome Validation using Singly Linked List

Use Case Objective

To validate whether a given string is a palindrome by converting it into a Singly Linked List, reversing the second half in-place, and comparing both halves using an efficient algorithm.

Use Case Description

This use case demonstrates how a palindrome check can be implemented using a dynamic data structure (Singly Linked List) instead of relying on built-in string reversal methods.

The solution uses:

Fast and Slow pointer technique to find the middle

In-place reversal of the second half

Node-by-node comparison for validation

Use Case Flow
Step 1: Input

Accept a string from the user.

Step 2: Convert String to Linked List

Each character of the string is converted into a node.

Nodes are connected sequentially to form a singly linked list.

Step 3: Find Middle of the List

Use Fast and Slow pointer technique:

Slow pointer moves one step.

Fast pointer moves two steps.

When fast reaches the end, slow is at the middle.

Step 4: Reverse Second Half (In-Place)

Reverse the linked list starting from the middle.

No extra memory is used.

Step 5: Compare Both Halves

Compare first half and reversed second half node-by-node.

If all characters match → Palindrome.

If mismatch found → Not a palindrome.

Step 6: Display Result

Print whether the string is a palindrome or not.
