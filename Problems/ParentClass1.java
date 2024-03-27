package Problems;

public class ParentClass1 {
    String st="Parent Class";
    private int k=22;

    public int getK(){
        return k;
    }


    void method(){
        System.out.println("method in parent class");
    }

     public void method1(){
        System.out.println("method1 in parent class");

    }
    void method2(){
        System.out.println("method2 in parent class");
    }

    static void method3(){
        System.out.println("static method3 in parent class");
    }

    ParentClass1(){
        System.out.println(" this is parent class constructor");
    }

    //constructor

    public static void main(String[] args) {
        ParentClass p2=new ParentClass();
        ParentClass1.method3();
        p2.method2();

    }

    
    
}
    

