import java.util.Scanner;

public class checkingPalindrom {
    public static int revers(int n){
        int digit =0;
        while(n>0){
            int temp=n%10;
            digit = digit*10 + temp;
            n=n/10;
        }
        return digit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to check : ");
        int num = sc.nextInt();
        int num2 = revers(num);
        if(num==num2) System.out.println("it is a palindrome");
        else System.out.println("it is Not a palindrome");
    }
}
