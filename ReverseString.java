package Strings;
public class ReverseString {
        public static void main(String[] args) {
            String str = "JafreAlAm";  // Input string
            StringBuilder reversedStr = new StringBuilder(str);  // Create a StringBuilder with the input string
            reversedStr.reverse();    // Reverse the string
            
            System.out.println("Reversed String: " + reversedStr);  // Output the reversed string
        }
     }
