package DSA.Array;

public class SndMax {
    public static void main(String[] args) {
        int [] arr = {11,23,4,5,56,7,8,9,100};
        int max1 ,max2;
        max1=max2=arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}
