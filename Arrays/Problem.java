public class Problem{
    
    public static void main(String[] args) {
    
    int[] arr={1,2,3,4};
    String s="";

    for(int i=0;i<arr.length;i++){
     s+=arr[i]+"s";
    }
    
    int len=s.length()-1;
    System.out.println(len);
    String sli=s.substring(0,len);
System.out.print(sli);
}

}













