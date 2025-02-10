public class Problem{
    void greet(){
        System.out.println("hello");
        hello();
    }
    void hello(){
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        Problem obj1=new Problem();
        obj1.greet();//static la did not call non static.
    
    }
}