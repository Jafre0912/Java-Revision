import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NoUnitOfMatrial = sc.nextInt();
        int TotalCost = NoUnitOfMatrial * 100;
        if(TotalCost>1000){
            int discount = (TotalCost*10)/100;
            TotalCost = TotalCost - discount;

        }
        System.out.println(TotalCost);
    }
}