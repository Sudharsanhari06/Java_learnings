
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String name=in.nextLine();
        String nstr="";
        for(int i=name.length()-1;i>=0;i--){
                nstr+=name.charAt(i);
        }
        if(name.equals(nstr)){
            System.out.println("its a palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    }
}