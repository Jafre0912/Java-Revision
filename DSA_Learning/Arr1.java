class Main{
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 1; 
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for(int arrs: arr){
            System.out.print(arrs+" ");
        }
        System.out.println();
       change_Arr(arr);
    }
    static void change_Arr(int [] arr){
        for(int i = 0; i<arr.length; i++){
            arr[i] = 0; //chnaging the array here
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       // System.out.println(arr[i]);
    }
}