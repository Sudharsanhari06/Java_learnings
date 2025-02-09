public class problem1{
public static void main(String[] args) {


    int num1=1;
    int num2=10;
    byte count=0;
    for(int i=num1;i<=num2;i++){
        if(i%2==0){
            System.out.println(i);
        }
        else{
            count++;
        }

    }
    System.out.println("odd number count "+count);


}

}