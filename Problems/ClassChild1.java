package Problems;

public class ClassChild1 extends ParentClass1{
    

        int i=10;
        String st="Child Class";
        void method(){
            System.out.println("method in child");
        }
     
       public void method1(){
           // super();
           System.out.println(" method1 in child class "+st); //using super keyword
            System.out.println("method1 in child Class :"+super.st);
        }
        void method2(){
            this.method1(); // it invokes current class method1
            super.method1();// it invokes super class method1
    
            System.out.println("method2 in child class");
        }
        static void method3(){
            System.out.println("method3 in child class");
        }
    
        //constructor
        ClassChild1(){
            //super(); for default constructor super is not necessary 
            System.out.println("childc class constructor");
        }
    
    
    
        public static void main(String[] args) {
            ClassChild1 ch1=new ClassChild1();
            ch1.method();
          //  ch1.method1();
          //  System.out.println(ch1.st);
            //super.method1();-- we cannot use super keyword static methods
          //  method3();
          //ChildClass1.method3();
          //ParentClass.method3();
         // System.out.println(ch1.getK());
        }
        
    }
    
    
    //code reusability,method overriding is only achieveable through inheritancr
    // it is one way achieves  run time polymorphism
    //in java's java.lang.package
    //1. cannot reduce visibility form super class to base class
    //2.can we oveerrload static methods 
    //3.but we cannot override static methods and private methods
    //4.
    
}
