public class GCD {
    public static void main(String[] args) {
        System.out.println(FindGCD(25, 15));//here the method is statics so directly we can call it no need to create
    }
    static int FindGCD(int n, int m){
        while(n!=m){
            if(n>m){
                n = n-m;
            }else{
                m = m-n;
            }
            //return n;
        }
        return n;
    }
}
