public class Problem1{
// old switch statements
    public static void main(String[] args) {
        byte n=5;
            switch(n) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
               
                default:
                    // throw new AssertionError();
                    System.out.println("wrong");
                    break;
            }
    }
}