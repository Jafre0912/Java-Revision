package Strings;
import java.util.Scanner;
public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String OrgStr = sc.nextLine();
        String revStr = "";
        for(int i = OrgStr.length()-1; i>=0; i--){
            revStr = revStr + OrgStr.charAt(i);
        }
        System.out.print("the reverse of  it: "+revStr);
        sc.close();
    }
}
