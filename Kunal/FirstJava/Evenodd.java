// Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;

public class Evenodd{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("The Number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}