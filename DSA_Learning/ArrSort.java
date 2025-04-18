import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        int [] arr = {1,11,2,22,3,33,4,44,5,55};
        sort(arr);

        int ans[] = smallestLaregstElement(arr);
        System.out.println("smallest: "+ans[0]);
        System.out.println("largest: "+ans[1]);
    }
    static void sort(int arr[]){
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    //Finding the smallest and largest element in array

    static int[] smallestLaregstElement(int [] arr){
        Arrays.sort(arr);
        int smallEl = arr[0];
        int largeEl = arr[arr.length-1];
        int[] ans = {smallEl,largeEl};
        return ans;
    }



    //find Kth largest and Kth smallest element in the array 
    
}