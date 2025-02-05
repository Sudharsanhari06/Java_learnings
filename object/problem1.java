class problem1{
    public static void main(String args[]){
        System.out.println("hello");
        
        arithmeticOperator arithmetic = new arithmeticOperator();
        
        int b=arithmetic.add();
        
      System.out.println("add"+b);
    }
}
class arithmeticOperator {
        int a=10;
        int b=15;
        public int add(){
            return a+b;
        }
        
}