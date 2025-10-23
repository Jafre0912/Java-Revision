package DSA.Array;

public class SndMax {
    public static void main(String[] args) {
        int [] arr = {11,23,4,5,56,7,8,9,100,100};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        if(arr==null || arr.length<2){
            throw new IllegalArgumentException("array must have atleast 2 elements");
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2 && arr[i] != max1){
                max2=arr[i];
            }
        }
        if(max2==Integer.MIN_VALUE){
            throw new IllegalArgumentException("ARR MUST HAVE 2 unique elements");
        }
        System.out.println(max2);
    }
}
