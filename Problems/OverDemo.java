package Problems;

class A{
    void show(){
        System.out.println("Base class show");
    }
}
class B extends A{
    void show(){ //override method
        System.out.println("Derived show");

    }
}
class OverDemo{
    public static void main(String[] args) {
        A obj1=new A();
        obj1.show();
        A obj2= new B();
        obj2.show();
        // B obj1= new B();
        // obj1.show();
        // B obj2 = new B();
        // obj2.show();


    }
}