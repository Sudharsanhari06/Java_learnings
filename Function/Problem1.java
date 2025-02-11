
import java.util.Scanner;

public class Problem1{
    public static void main(String[] args) {
        sum(); 
        int multiplay=mul();
        System.out.println("Multiplication : "+multiplay);
    }
    static  void sum(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1=input.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2=input.nextInt();
        System.out.println("Addition: "+ (num1+num2));


    }

    static int mul(){
  Scanner input=new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1=input.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2=input.nextInt();
      return (num1*num2);

    }


}
