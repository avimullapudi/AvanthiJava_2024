package Problems;

class GrandFather{
    void assest(){
        System.out.println("I have land");
    }
}
class Father extends GrandFather{
    void display(){
        System.out.println("this is display");
    }
}

public class SingleDemo {
    public static void main(String[] args) {
        Father obj = new Father();
        obj.assest();
        obj.display();
    }

    
}
