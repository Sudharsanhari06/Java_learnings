// Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class Largesttwonumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1=in.nextInt();
        System.out.print("Enter the number 2: ");
        int num2=in.nextInt();
        if(num1<num2){
            System.out.println("Largest Number: "+num2);
        }
        else{
            System.out.println("Largest Number: "+num1);
        }
    }
}