public class TypeCasting {
    public static void main(String[] args) {
        char c = 'A';
        byte b = 10;
        short s = 12;
        int i = 13;
        float f = 14.5f;
        double d = 555d;
        long l = 5555;
       // i = c;
       // b =(byte) i; // this is calleed narrowing explicit 
       // f = i;
        i =(int) f;

        System.out.println(i);
    }
}
