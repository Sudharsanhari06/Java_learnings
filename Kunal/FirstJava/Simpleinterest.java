// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Simpleinterest{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        int p=input.nextInt();
        System.out.print("Enter the Time: ");
        int t=input.nextInt();
        System.out.print("Enter the rate: ");
        int r=input.nextInt();

        float si=(p*t*r)/100f;
        System.out.println("SI "+si);

    }
}