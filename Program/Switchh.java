//printing days in week 
import java.util.*;
public class Switchh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:System.out.println("SUN");
                break;
            case 2: System.out.println("MON");
                break; 
            case 3: System.out.println("TUE");
                break;
            case 4: System.out.println("WED");
                break;
            case 5: System.out.println("THU"); 
                break;
            case 6: System.out.println("FRI");
                break;
            case 7: System.out.println("SAT"); 
                break;
            default:System.out.println("INVALID DAY");
                break;
               
        }
        sc.close();
    }
}