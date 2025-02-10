public class Newswitch{ 
    public static void main(String[] args) {
        String day="Monday";
        switch(day){
            case "saturday","sunday" -> System.out.print("6am");
             
            case "Monday" -> System.out.println("8am"); 
            default->System.out.println("7am");


            // : yield
            
        }
    }
}