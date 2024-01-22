import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter elements of Array (Enter -1 to stop): ");
        Scanner scan = new Scanner(System.in);
        int n = 0;

        // Taking Input Array
        while (n != -1) {
            n = scan.nextInt();
            if (n != -1)
                arr.add(n);
        }

        // Sorting the array for binary search
        arr.sort(null);

        System.out.print("Enter element to search: ");
        int key = scan.nextInt();
        int high = arr.size() - 1; // Adjusted the high to the last index
        int low = 0;
        int mid = 0;

        // Binary search loop
        while (low <= high) {
            mid = (low + high) / 2;

            if (arr.get(mid) == key) {
                System.out.print("Found at location " + ++mid);
                break; // Stop the loop when the element is found
            } else if (arr.get(mid) < key) {
                low = mid + 1; // Update the low index for the right half
            } else {
                high = mid - 1; // Update the high index for the left half
            }
        }

        if (low > high) {
            System.out.print("Element not found");
        }
    }
}
