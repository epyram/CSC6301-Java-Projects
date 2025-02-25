import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 * A program that reads a list of integers from standard input, stores them in a linked list,
 * sorts the list, and prints the sorted list.
 */
public class SortedLinkedList {

    /**
     * The main method reads integers from the command line input, adds them to a linked list,
     * sorts the list using the Collections Framework, and prints the sorted list.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>(); // Reuses Java's LinkedList implementation

        System.out.println("Enter integers (press Ctrl+D/Ctrl+Z to finish input):");

        // Read integers from input until no more are available
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        // Sort the list using the Collections Framework
        Collections.sort(numbers); // Reuses the built-in sorting algorithm

        // Output the sorted list
        System.out.println("Sorted linked list: " + numbers);
    }
}