import java.util.Stack;          
import java.util.Collections;    
import java.util.Scanner;        

/**
 * A program that reads integers from standard input, stores them in a stack,
 * sorts the stack using the Collections Framework, and prints the sorted stack.
 * 
 * Design Notes:
 * - Maintains the core structure of Project #4 but adapts LinkedList to Stack
 * - Reuses Collections.sort() for efficient sorting (dual-pivot quicksort)
 * - Uses standard input/output mechanisms unchanged from original project
 */
public class SortedStack {

    /**
     * Reads integers from command line input, adds them to a stack,
     * sorts the stack, and prints the result.
     * 
     * 
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Code Reuse: Scanner class reused from original project
        Scanner scanner = new Scanner(System.in);  
        Stack<Integer> numbers = new Stack<>();    // Code Reuse: Collections Framework Stack

        System.out.println("Enter integers (press Ctrl+D/Ctrl+Z to finish input):");

        // Code Reuse: Input loop structure preserved from original implementation
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.push(number); // Code Reuse: Stack's push() method
        }

        // Code Reuse: Collections.sort() reused for sorting
        Collections.sort(numbers);  // Same sorting call as original project

        // Output formatting preserved from original implementation
        System.out.println("Sorted stack: " + numbers);
    }
}