package DSA.Array;

public class ReverseCopyArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int [] revArr = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            revArr[i] = arr[arr.length-1-i];
        }
       System.out.println("the reverse array is :");
       for(int num:revArr){
        System.out.print(num+"");
       }
       System.out.println();
    }   
}
