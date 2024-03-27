package Problems;

public class SuperDemo {
    int i =20;
    void print(){
        System.out.println("this is value");
    }
    
}
class SuperVar extends SuperDemo{
    int i = super.i;
    void print(){
        super.print();
        System.out.println(i);
    }
}
class SuperVar1{
    public static void main(String[] args) {
        SuperVar obj= new SuperVar();
        obj.print();
    }
}
