/**
 * InnerOOPS
 */
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }
    public void printColor (){
        System.out.println(this.color);

    }

    
}
class Student{
    String name;
    String age;
    String height;
    public void printInfo(){
        System.out.println(this.height);
        System.out.println(this.age);
        System.out.println(this.name);
    }
        

        
    }



public class OOPS {
    public static void main(String[] args) {
       ;

        Student s1=new Student();
        s1.name="lal bahadur sahani";
        s1.age="18";
        s1.height="164";
        s1.printInfo();
    
    
    
    }


    
}
