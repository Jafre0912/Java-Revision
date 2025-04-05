//panildrome number: if the reverse of the number is same as the number itself means no change after reverse called panildrome of a number 
import java.util.*;
public class Panildrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Pan = sc.nextInt();
        //int org_Num = Pan;
        //condition to check if the number is panildrome or not
        int rev = 0;
        int Org_Num = Pan; 

        while(Pan>0){
            rev = rev*10+Pan%10;
            Pan = Pan/10;
        }
        if(Org_Num==rev){
            System.out.println(Org_Num+ " is a Panildrome");
        }else{
            System.out.println(Org_Num+ " is not a panildrome");
        }
        sc.close();
    }
}
