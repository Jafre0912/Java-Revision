import java.util.Scanner;
public class BonusP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Salary = sc.nextInt();
        int year = sc.nextInt();
        int bonus = 0;
        if(year>5){
            bonus = (Salary * 5)/10;
        }
            System.out.println("bonus is " + bonus);
    }
}