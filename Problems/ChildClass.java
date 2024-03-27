package Problems;

public class ChildClass extends ParentClass {

    int k=20;
    double d=23.55;
    char c='f';

    void display1(){
        System.out.println("this is void display");
    }
    public static void main(String[] args) {
        ChildClass chobj=new ChildClass();
      //  chObj.i;  --> we cannot access parentclass function with childclass instance
        // by using inheritance we can access
        System.out.println(chobj);
        System.out.println(chobj.k);

        // System.out.println(chobj.i);
        // chobj.method2();
        // chobj.grandMethod();

    }
    
}
