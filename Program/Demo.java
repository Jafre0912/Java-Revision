/*Tou have given an input n of integer data type 
you have to print the series n, n-3, n-6.....
import points: 1. you have to print each number in a different line 
2. Also you have to print till the time printed value is greater than 0.
*/
import java.util.*;
public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = num; i>0; i -=3){
            System.out.println(i);
        }
        sc.close();
    }
}