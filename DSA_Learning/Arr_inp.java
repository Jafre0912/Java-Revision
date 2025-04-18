import java.util.*;
public class Arr_inp{
    static int[] printArr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter"+ n+"Element");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        sc.close();
        return arr;
    }
    public static void main(String[] args) {
        

        //trying to copy/reference arr to arr2
        int [] arr2 = printArr();
        System.out.println("the or reference of the array is: ");
        System.out.println(Arrays.toString(arr2)); 

    }
}