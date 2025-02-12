
public class Armstrong{
    public static void main(String[] args) {
    int num=153;
    int original=num;
    byte count=0;
    String s=Integer.toString(num);
    int len=s.length();
    int sum=0;
    while(num>0){
        int n=num%10;
        num=(int)num/10;
        double ans=Math.pow(n,len);
        sum+=ans;
    }
    if(sum==original){
        System.out.print("The number is Armstrong:"+ original);
    }
    else{
System.out.print("The number is not armstrong number");
    }


    }

}
















