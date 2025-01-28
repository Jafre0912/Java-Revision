package DSA.Array;

public class ArrayInsertion {
    public static void main(String[] args) {
        // Initialize the array with extra space
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] newArr = new int[arr.length + 1]; // New array with extra space

        // Display the original array
        System.out.println("The original array is:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        int insertElement = 35;
        int pos = 4;

        // Copy elements up to 'pos' into newArr
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[pos] = insertElement;

        // Copy the remaining elements from 'arr' into 'newArr'
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // Display the new array
        System.out.println("The array after insertion is:");
        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }
}
