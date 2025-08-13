//here will check the various various way of priniting the string and its pool value also will chekc the same or not

package Strings;

public class Str1 {
    public static void main(String[] args) {
        //creating string pool
        String s1 = "java";
        String s2 = "java";//s2 also point the same memory location as s1 in string pool
        String s3 = new String("jafre alam");
        char[] c = {'J','A','F','R','E'};
        byte[]b = {66,67,68,69,70};
        String s4 = new String(c,1,3); // here mkaing string from the char array
        String s5 = new String(b,2,3); // here making the string from the byte array
        System.out.println(s4);
        System.out.println(s1==s2); //same 
        System.out.println(s1==s3); //different
        System.out.println(s5);
    }
}
