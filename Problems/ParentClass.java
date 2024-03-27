package Problems;

public class ParentClass extends GrandParent{

    int i=10;
    String st="HELLO WORLD";

    void method1(){
        System.out.println("this is void method1 in Parent class");
    }

    final void method2(){
        System.out.println("this is void method2 in Parent class ");
    }
    ParentClass(){
        //super();
        System.out.println("this is parent class constructor");
    }
    ParentClass(int i){
        //this.i=i;//super() if it has parent it class by implicity
        System.out.println("this is parent class par constructor");
    }
    
    public static void main(String[] args) {

        ParentClass objp1=new ParentClass();
       // objp1.childmethod;
        
        
    }
    
}
