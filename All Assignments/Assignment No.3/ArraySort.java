import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };

        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

