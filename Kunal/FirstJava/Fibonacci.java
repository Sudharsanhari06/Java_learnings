
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num=in.nextInt();

    int a=0;
    int b=1;
    for(byte i=1;i<=num;i++){
        System.out.println(a);
        int c=a+b;
        a=b;
        b=c;
    }





    }
}