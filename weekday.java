import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        System.out.println("enter week day");
        Scanner sc = new Scanner(System.in);
        int dayname= sc.nextInt();
        if(dayname < 0 || dayname > 31) {
            System.out.println("invalid statment");
            return;
        }
        int d = dayname%7;
        switch(d){
            case 0: System.out.println("saturday");
            break;
            case 1: System.out.println("sunday");
            break;
            case 2: System.out.println("monday");
            break;
            case 3: System.out.println("tuesday");
            break;
            case 4: System.out.println("wednesday");
            break;
            case 5: System.out.println("thrusday");
            break;
            case 6: System.out.println("friday");
            break;
            default : System.out.println("not in range");
        }

    }
}
