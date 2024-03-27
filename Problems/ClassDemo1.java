package Problems;

public class ClassDemo1 {

    static int i;  //i=33;
    String st="Avanthi";


    void method1(){
        
        System.out.println(i);  // i represent as this.i=i;
    }
    int method2(){
        System.out.println("this is int method");
        return i;
    }
    String method3(){  
        return st;
    }
    int kart(int num1,int num2){

         return num1+num2;
    }

    


    ClassDemo1(){  
        this(21,"karthik") ;   // we cannot give default constructor as private
        //this("kk");
        System.out.println("this is default constructor");
    }

    ClassDemo1(int i){  //33  classdemo(33)
        this();        this.i=33;
        this.i=i;    // this references to instances variables of current object
        System.out.println("this is integer constructor");
    }

    ClassDemo1(String st){
        this(63);
        this.st=st;
        System.out.println("this is String constructor");
    }

    ClassDemo1(int i, String st){
        this.i=i;
        this.st=st;
        System.out.println("this is both int and string constructor");
    }

    
}

class ClassDemo2{

    public static void main(String[] args) {

      //  ClassDemo1 ob=new ClassDemo1();
        ClassDemo1 ob1=new ClassDemo1();
        //ClassDemo1 ob2=new ClassDemo1("Avanthi");
        //ClassDemo1 ob3=new ClassDemo1(12,"Av2");

       // System.out.println(ob1.i);
       // System.out.println(ob2.st);
        //System.out.println(ob3.i+" "+ob3.st);

        System.out.println(ob1.i);
        System.out.println(ob1.st);
       // System.out.println(i);
       //ClassDemo1.i;
         
    }

}