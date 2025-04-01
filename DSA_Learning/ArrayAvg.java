package DSA.Array;

public class ArrayAvg {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int avg = 0;
        int sum = 0;
        for(int i= 0; i<arr.length; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        avg = sum/arr.length;
        System.out.println(avg);
    }
}
