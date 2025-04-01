import java.util.*;

public class WebType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Domain:");
        String domain = sc.nextLine().trim();  // Trim to remove extra spaces

        String type = domain.substring(domain.lastIndexOf(".") + 1);

        // Identify the domain type
        switch (type) {
            case "com":
                System.out.println("Commercial Website");
                break;
            case "org":
                System.out.println("Organization Website");
                break;
            case "gov":
                System.out.println("Government Website");
                break;
            case "net":
                System.out.println("Network Website");
                break;
            case "in":
                System.out.println("Indian Website");
                break;
            case "edu": System.out.println("Educational Website"); 
                break;
            case "us":System.out.println("United States Website");
                break;
            case "io": System.out.println("Tech/Startup website");
                break;
            case "info": System.out.println("Information Website");
                break;               
            default:System.out.println("Unknown domain type");
                break; 
        }

        sc.close();  
    }
}
