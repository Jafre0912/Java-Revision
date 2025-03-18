//here is the code about the post and pre oder 

//post order = Variablename++  eg. x++  first return the value of x and then increment the value of x
// preorder = ++x first increment the value of x and then return the value of x

// class Operators{
//     public static void main(String[] args) {
//         int x, y, z;
//         x = 5;
//         y = ++x;
//         z = x++;
//         int volume = x * y * z;
//         System.out.println(volume);
//     }
// }





//Bitwise Operator 
// 1)OR operator (|) : it will return 1 if any of the bits are 1
// 2)AND operator (&) : it will return 1 if both the bits are
// 3)XOR operator (^) : it will return 1 if only one of the
// 4)NOT operator (~) : it will return 1 if the bit is 0
// 5)Left shift operator (<<) : it will shift the bits to the left means leftshift by how many numbers will be the power of 2 eg. if x = 5 and x<<1 then x = 10 if x = 5 and x<<2 then x = 20 (x*2^2) x = 5 and x<<3 then x = 40 (x*2^3)
// 6)Right shift operator (>>) : it will shift the bits to the right it is opposite of left shift operator eg. if x = 10 and x>>1 then x = 5 if x = 20 and x>>2 then x = 5 (x/2 ^2) if x = 40 and x>>3 then x = 5 (x/ 2^3) 

public class Operators {

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = a&b;
        int d = a|b;
        int e = a^b;
        int f = ~a;
        int g = a<<2; // 5*2^2 = 20
        int h = b<<4; // 4*2^4 = 64    (2^4 = 2x2x2x2) similarly for k times 2^k ("<<") y multiply karega
        int i = a>>2; // 5/2^2 = 1.25  //">>" y devide krega 
        int j = b>>4; // 4/2^4 = 0.0625
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
    }
}