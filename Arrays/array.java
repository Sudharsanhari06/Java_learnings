
import java.util.Scanner;

public class array{
    public static void main(String[] args) {

  System.out.println("hello"); 

  int[] numarr=new int[5];
   Scanner userinput=new Scanner(System.in);
    for(int i=0;i<numarr.length;i++){
     
     numarr[i]=userinput.nextInt();
        
    }

    System.out.println(numarr[0]);
    System.out.println(numarr[1]);

    table tableclass=new table();
    int t=2;
    tableclass.twotable(t);
    
    }
}
class table{

    public void twotable(int t){
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+t+"="+i*t);
        }
    }
    
}