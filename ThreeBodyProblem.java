import java.util.Scanner;

class user{
    static String name;
    static int roll;
    static String sec;
    static String branch;
}
public class ThreeBodyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        user[] u = new user[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter name of student "+(i+1)+":");
            u[i].name = sc.nextLine();
            System.out.print("Enter roll of student "+(i+1)+":");
            u[i].roll = sc.nextInt();
            System.out.print("Enter sec of student "+(i+1)+":");
            u[i].sec = sc.nextLine();
            System.out.print("Enter branch of student "+(i+1)+":");
            u[i].branch = sc.nextLine();
        }
        for(int i=0;i<3;i++){
            System.out.println("Name: "+u[i].name);
            System.out.println("Roll: "+u[i].roll);
            System.out.println("Section: "+u[i].sec);
            System.out.println("Branch : "+u[i].branch);
        }

    }
}
