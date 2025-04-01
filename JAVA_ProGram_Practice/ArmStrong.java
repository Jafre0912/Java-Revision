// ArmStrong Number = if the sum of the cube of the digits of the numbers are equal is called ArmStrong Number Example 153 = 1^3+5^3+3^3 = 153
package ArmStrongNum;
import java.util.*;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        while(n>0){
            int rem = n%10; // Get the last digit
            sum = sum + rem*rem*rem; // Add the cube of the digit to sum
            n = n / 10; // Remove the last digit
        }
        if(sum==m){
            System.out.println("yes it is Armstrong number");
        }
        else{
            System.out.println("not it is not");
        }
        sc.close();
    }
}
