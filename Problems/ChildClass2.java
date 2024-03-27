package Problems;

// this cannot access child class functions
public class ChildClass2 extends ParentClass{
    int t=80;

    // void allDispaly(){
    //     System.out.println("this is alldisplay method in Childclass2");
    // }
    //method overriding(grand parent method)
     void allDisplay2(){
        System.out.println("this diplay in child class");
    }
    // we cannot reduce the visibillity of parent classes
    public void allDisplay3(){
        super.allDisplay3();// we can invoke superr class methods
        System.out.println("this is alldisplay3 method in childclass");
    }
    // protected visibillity > default visibility
  protected void allDispaly4(){
        System.out.println("this is display4 in childclass");
    }
    //by using static we can hide the data -data hiding
    static void allDispaly5(){
        System.out.println("this is statici in child class");
    }
    void childmethod(){
        System.out.println("this is child method");
    }
    // final method cannot be overriden
    // void method2(){
    //     System.out.println("this is final method in child class");
    // }

    ChildClass2(){
        super(99);// class parent class constructor
        //super(); by default it calls parent class constructor
        System.out.println("this is child class constructor");

    }

    public static void main(String[] args) {
        
        ChildClass2 obch2=new ChildClass2();
        obch2.allDispaly();
      //  obch2.grandMethod();
       // System.out.println(obch2.i);
      //  obch2.a=100; // we can change the values of parent classes directly 
    //   obch2.allDispaly();
    //     obch2.allDisplay2();
    //     GrandParent.allDispaly5();

    }
    
}

// in method overriding signature name should be same 
// in meythod overriding we can increase the visibillity but cannot reduce the visibillity
// we can access static methods of class by class_name.method_name
//constructors are cannot inhherited because they are not member 
//only fields and methods are inhertited