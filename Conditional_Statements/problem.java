
import java.util.Scanner;

class problem {
    public static void main(String args[]) {
        Scanner number = new Scanner(System.in);
        // System.out.println("Enter the number 1");
        // byte num1 = number.nextByte();
        // System.out.println("Enter the number 2");
        // byte num2 = number.nextByte();
        // number.nextLine();
        System.out.println("enetr the text");
        String userinput = number.nextLine();

        greatertwonumber methodnumber = new greatertwonumber();
        // methodnumber.twonumber(num1,num2);

        // compare string
        // methodnumber.comparestring(userinput);
       
        System.out.println("Enter the marks");
        byte mark = number.nextByte();
        methodnumber.marks(mark);

    }

}

class greatertwonumber {

    public void twonumber(byte num1, byte num2) {
        if (num1 < num2) {
            System.out.println("Greater Number " + num2);
        } else {
            System.out.println("Greater Number " + num1);
        }
    }

    public void comparestring(String userinput) {
        // String a1="apple";
        // String a2="apple";


        String f1=new String("orange");
        String f2=new String("orange");
        System.out.println(f1==f2);

        // String
        // System.out.print(a1==a2);
        if (userinput.equals("Win")) {
            System.out.println("Ee sala cum namdhey");
        } else {
            System.out.println("cup illa");
        }
    }

    public void marks(byte mark) {
        if (mark >= 35) {
            System.out.print("pass");
        } else {
            System.out.print("fail");
        }
    }

}
