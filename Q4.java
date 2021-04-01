package Lab2;

import java.util.Random;
import java.util.Arrays;

public class Q4 {
    public static int[] arr = new int[10];
    public static void Random(int arr[]){
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(100);
        }
    }
    public static void main(String[] args) {
        Random(arr);
        System.out.println(Arrays.toString(arr));
    }
    }
