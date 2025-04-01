
//methiod of string creation 

package Strings;

public class StrMethod {
    public static void main(String[] args) {
        String str1 = new String("This string object creating in heap with help of new keyword");
        System.out.println(str1);
        String str2 = "This String creating object in string pool and str2 is pointing";
        System.out.println(str2);
        char c[] = {'H','E','L','L','O'};
        String str3 = new String(c);
        System.out.println(str3);

        byte b[] = {65,66,67,68,69}; //this bytes are ASCII Characters 65 as A and so on
        String str4 = new String(b);//(This string is constructor which is the same name as class)
        System.out.println(str4);
    }
}
