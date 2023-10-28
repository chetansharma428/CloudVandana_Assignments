import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array); // function which shuffles 
        System.out.println(Arrays.toString(array));// converting it to string to print the array in one go
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random(); // using random to get numbers in random every time

        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

// Time Complexity: O(N) N = length of the array
// Space Complexity: O(N) number array 

