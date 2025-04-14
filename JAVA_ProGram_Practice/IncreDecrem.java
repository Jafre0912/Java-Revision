public class IncreDecrem{
    public static void main(String[] args) {
        int a = 5;
        int b = a++; //this will print 5 then it will increse by 1 and will become 6
        int c = ++a; // first increment by 1 and become 6 then will print 6
        int d = a--; // first print then decrement 
        int e = --a; // first decrement and print 
        int f = 10;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f++);
        System.out.println(++f);
    }
}