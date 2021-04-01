package Lab2;

public class Q2 {
    public static int [] arr={10, 20, 30, 40, 50, 60, 70, 80, 90};
    public static int [] arr2 = new int[arr.length];
    public static void cloneArray(int a[],int b[]){
        System.out.println("The elements of A: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\nThe elements of B: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        arr2 = arr;
        arr2[0]++;
    }
    public static void main(String[] args){
        cloneArray(arr,arr2);
    }
}
