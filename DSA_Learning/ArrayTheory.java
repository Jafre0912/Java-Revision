//declaration of array 
/*
 int [] arr = new int[10];
 int []arr1; // array declaration 
 arr1 = new int[4];

 int [] str = {};
 */




public class ArrayTheory{
    public static void main(String[] args) {
        int [] age = new int[5];
        age[0] = 12;
        age[1] = 13;
        age[2] = 14;
        age[3] = 15;
        age[4] = 16;
        //System.out.println(age[5]); // ArrayIndexOutOfBoundsException error 
        System.out.println(age[1]);
        for(int i = 0; i<age.length; i++){
            System.out.println(age[i]);
        }
    }
}