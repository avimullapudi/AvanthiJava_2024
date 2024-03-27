package Problems;

public class StaticUse {
    String name;
    int rollno;
    static String collegeName = "EIU";
    StaticUse(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void Display(){
        System.out.println("name"  +name);
        System.out.println("rollno" + rollno);
        System.out.println("collegeName" +collegeName);
    }
    public static void main(String[] args) {
        StaticUse Obj1= new StaticUse("Avi", 1);
        StaticUse Obj2= new StaticUse("Avanthi", 2);
        System.out.println("StaticUse1");
        System.out.println("StaticUse2");
    }
    
}
