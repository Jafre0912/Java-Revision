//fibonaaci number a number which is the sum of the previous 2 numbers i.e. 0 1 1 2 3 5 8 13 21 34 55 etc
public class Fibo {
    public static void main(String[] args) {
        int ans = fibo(5);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n<=0){
            return 0;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}


