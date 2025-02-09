
import java.util.Scanner;

public class Problem2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arraysize=input.nextInt();
        int[] arr= new int[arraysize];

        for(byte i=0;i<arr.length;i++){
            System.out.print("Enter the array Number");
            arr[i]=input.nextInt();
        }

        float middle=(arr.length)/2;
        int m=(int)middle;
        System.out.println(arr[m]);


    }

}