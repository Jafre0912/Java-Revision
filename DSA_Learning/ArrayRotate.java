package DSA.Array;

public class ArrayRotate {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80,90};
        for(int x:arr){
            System.out.print(x+",");
        }

        //Left Rotation
        System.out.println();
        int temp = arr[0];
        for(int i = 1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for(int x:arr){
            System.out.print(x+",");
        }
        System.out.println();

//now for the right rotation 
         for(int y:arr){
            System.out.print(y);
         }
        System.out.println();
        int temps = arr[arr.length-1];
        for(int i = arr.length-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temps;
        for(int y:arr){
            System.out.print(y+" ");
        }
        System.out.println();
    }
}
