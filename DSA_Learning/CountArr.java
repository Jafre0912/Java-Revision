//count the number of occurences of a particular element x

class Main{
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 4; 
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int x = 4; // here initilizing for 4 that how many times 4 occurs in the array 
        System.out.println("Count of X is: "+ countOccurences(arr, x)); 
    }
    static int countOccurences(int [] arr, int x){
        int count = 0;
        //x = 5;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

}