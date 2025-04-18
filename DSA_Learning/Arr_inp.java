import java.util.Arrays;
import java.util.*;

public class Arr_inp {
    static int[] printArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
        return arr;
    }

    // Overloaded method to print array
    static void printArr(int[] arr) {
        System.out.println("Printing array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Getting array from user
        int[] arr2 = printArr();

        System.out.println("The reference of the array is: ");
        System.out.println(Arrays.toString(arr2));  // Proper display

        // Copying arr2 into arr3
        int[] arr3 = Arrays.copyOf(arr2, arr2.length);
        System.out.println("The copied array in arr3:");
        printArr(arr3); // Call to overloaded method
    }
}
