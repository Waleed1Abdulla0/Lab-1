package Lab2;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Q3 {
    public static int[] arr = { 10, 20, 30, 40, 50 };
    public static int[] removeTheElement(int[] arr, int index)
    {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        return IntStream.range(0, arr.length)
                .filter(i -> i != index)
                .map(i -> arr[i])
                .toArray();
    }
    public static void main(String[] args)
    {
        // Print the resultant array
        System.out.println("Original Array: " + Arrays.toString(arr));
        // Get the specific index
        int index = 4;
        // Print the index
        System.out.println("Index to be removed: " + index);
        // Remove the element
        arr = removeTheElement(arr, index);
        // Print the resultant array
        System.out.println("Resultant Array: " + Arrays.toString(arr));
    }
}
