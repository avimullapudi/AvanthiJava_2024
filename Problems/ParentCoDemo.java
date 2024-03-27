package Problems;

public class ParentCoDemo {
    int a;
    int b;
    ParentCoDemo(int a, int b){
        //this();
        this.a=a;
        this.b=b;
        int add;
        add = a+b;
        System.out.println(add);
        System.out.println("this is parameter constructor");
    }
    
}
class B extends ParentCoDemo{
    B(int a,int b){

        super(a,b);
        System.out.println("child class constructor");
    }
    
}
class Main{
    public static void main(String[] args) {
        B Bobj = new B(10, 20);
    }
}
