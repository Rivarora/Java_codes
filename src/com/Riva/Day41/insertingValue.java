import java.util.Arrays;

public class insertingValue {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 0}; // Size 5, last space free
        int n = 4; // Current number of elements
        int value = 25;
        int pos = 2; // Insert at index 2

        // Shift elements to the right
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the value
        arr[pos] = value;
        n++; // Update current number of elements

        // Print the array
        System.out.println(Arrays.toString(arr));
    }
}
