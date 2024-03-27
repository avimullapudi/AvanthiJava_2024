package Problems;

public class VariablesDemo {
    String st= "Avi"; //instance var-> inside class and outside method and we have to create obj to acess instance var i.e.,obj.varname
    static int  i =50; //Static variable -> to access we have to use classname.varname

    void display(){
        System.out.println(st);
        System.out.println(i);
    }
    static void staticDisplay(){ //static method
        System.out.println(i);
    }
    public static void main(String[] args) {
        int a=10; //Local Var-> inside method 
        System.out.println(a);
        VariablesDemo obj= new VariablesDemo();
        System.out.println(obj.st);
        System.out.println(VariablesDemo.i);
        obj.display();
        staticDisplay(); //We can call static method directly 


    }
    
}
    

