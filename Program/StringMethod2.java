package Strings;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "Mr. Shahrukh khan";
        String str1 = "www.lpu.co.in";
        System.out.println(str.startsWith("Sh")); //this string not starting with Sh it is starting with M, Mr, Mr.
        System.out.println(str.endsWith("khan")); //yes it is ending with khan
        System.out.println(str.charAt(5)); //charAt(str.length) character at 5 index
       // for(int i = 0; i<str.length();i++){
            //System.out.print(str.charAt(i));
       // }  
        System.out.println(str1.indexOf('.')); //Finds the first position (index) of the character '.' in the string.
        System.out.println(str1.indexOf('.',7 )); //Same as above, but starts searching from index 7 instead of the beginning.Skips everything before index 7.
        System.out.println(str1.lastIndexOf("co")); //Finds the last occurrence of "co" in the string. Returns the starting index of the last match.Returns -1 if not found.
        System.out.println(str1.lastIndexOf('w',1 ));
    }
}
