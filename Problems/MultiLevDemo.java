package Problems;
class GrandFather{
    void assest(){
        System.out.println("This is my land");
    }
}
class Father extends GrandFather{
    void display(){
        System.out.println("This is display");
    }
}
class Child extends Father{
    void hi(){
        System.out.println("this is child class");
    }
}
public class MultiLevDemo {
    public static void main(String[] args) {
        Child obj= new Child();
        obj.hi();
        obj.display();
        obj.assest();
    }
    
}
