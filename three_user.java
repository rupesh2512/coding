import java.util.Scanner;

public class three_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i<3){
            System.out.println("enter the name of first user : ");
            String user = sc.nextLine();
            System.out.println("enter the roll number ");
            int roll = sc.nextInt();
            System.out.println("enetr section");
            String section = sc.nextLine();
            System.out.println("enter branch");
            String branch = sc.nextLine();
            System.out.println(user);
            System.out.println(roll);
            System.out.println(branch);
            System.out.println(section);
            i++;
        }
        
    }
}
