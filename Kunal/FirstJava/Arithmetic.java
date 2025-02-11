
import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Arithmetic{
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number 1:");
        int num1=in.nextInt();
        System.out.print("Enter the Number 2:");
        int num2=in.nextInt();
        System.out.print("Enter the operator any one + - * /: ");
        in.nextLine();

String op=in.nextLine();

if(op.equals("+")){
System.out.println("Addition : "+num1+num2);
}
else if(op.equals("-")){
 System.out.println("Subtraction : "+ (num1-num2));
}
else if(op.equals("*")){
 System.out.println("Multiplication : "+ (num1*num2));
}    
else if(op.equals("/")){
      System.out.println("Division : "+ (num1/num2));
}       
    }
}