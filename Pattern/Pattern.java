public class Pattern{
    public static void main(String[] args){
        
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        for(byte i=1;i<=5;i++){
            for(byte j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}