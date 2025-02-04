import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the grade of student : ");
        int grade = sc.nextInt();
        if(grade>=90) System.out.println("O");
        else if(grade>=80) System.out.println("E");
        else if(grade>=70) System.out.println("A");
        else if(grade>=60) System.out.println("B");
        else if (grade>=50) System.out.println("C");
        else if (grade>=40) System.out.println("D");
        else System.out.println("fail");
    }
}
