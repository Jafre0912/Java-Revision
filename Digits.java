package ArmStrongNum;
import java.util.*;
public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem;
        while(num>0){
            rem = num % 10;
            num = num/10;
            System.out.print(rem+" ");
        }
        sc.close();
    }
}
