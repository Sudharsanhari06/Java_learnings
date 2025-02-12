



public class Main{
    public static void main(String[] args) {

        student s= new student();
        s.setName("sudharsan");
        s.setAge(18);
        s.setEngMark(80);

    
        System.out.println("name"+ s.getName());
        System.out.println("age"+s.getAge());
        System.out.println("marks: "+s.getEngMark());
        
    // System.out.println(s1);

        student s1=new student("sanjai",22,100);
        s1.print();
    }

}

class student{
    private String name;
    private int age;
    private double engmark;

    public student(){

    }


    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }

    public void setEngMark(double engmark) {
        this.engmark = engmark;
    }

    public double getEngMark() {
        return this.engmark;
    }

    public student(String name, int age, double engmark) {
        this.name = name;
        this.age = age;
        this.engmark = engmark;
    }


     public void print() {
        System.out.println("Name: "+this.name);
        System.out.println("Age : "+ this.age);
        System.out.println("Marks: "+this.engmark);

    }



}