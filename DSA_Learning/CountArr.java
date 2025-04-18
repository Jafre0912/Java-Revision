//count the number of occurences of a particular element x

class Main{
    public static void main(String[] args) {
        int [] arr = new int[7];
        arr[0] = 4; 
        arr[1] = 3;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        int x = 3; // here initilizing for 4 that how many times 4 occurs in the array 
        //System.out.println("Count of X is: "+ countOccurences(arr, x));
        // System.out.println(lastOccurences(arr, x));
        System.out.println(greaterElement(arr, x));
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


    ////count the last index occurences of a particular element x
    static int lastOccurences(int arr[], int x){
        int lastIndex = -1; // if last index not are in array will return this 
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }




    //Count the number of elements strictly greater that value x
    static int greaterElement(int [] arr, int x){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }

}