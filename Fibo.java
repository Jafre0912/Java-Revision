//fibonaaci number a number which is the sum of the previous 2 numbers i.e. 0 1 1 2 3 5 8 13 21 34 55 etc
public class Fibo{
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-1)+fibo(n-2);
    }
}