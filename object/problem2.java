class problem2{
    public static void main(String[] args) {
    System.out.println("Try programiz.pro");
    bike bikevar=new bike();
    bikevar.IngineStart();
    bikevar.IngineStop();
    bikevar.bikeamount();
    
    }
}

   
 class bike{
     public void IngineStart(){
         System.out.println("bike ingine is started");
     }
       public void IngineStop(){
         System.out.println("bike ingine is stop");
     }
     public void bikeamount(){
         int a=3000;
         System.out.println(a);
     }
 }
 
 
   
 class car{
     public void IngineStart(){
         System.out.println("car ingine is started");
     }
       public void IngineStop(){
         System.out.println("car ingine is stop");
     }
     public void bikeamount(){
         int a=300000;
         System.out.println(a);
     }
     
     
 }