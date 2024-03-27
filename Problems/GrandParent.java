package Problems;

public class GrandParent {  // extends object implicitly . every class extends object if it doesn't have parent class

    int a=40;
    String s1="Avanthi";

    void grandMethod(){
        System.out.println("this method in grandparent class");
    }
    void allDispaly(){
        System.out.println("this alldisplaymethod in gp");
    }
    void allDisplay2(){
        System.out.println("this is grandparent display method2");
    }
   public void allDisplay3(){
        System.out.println("this is alldisplay3 method in gp");
    }
   protected  void allDispaly4(){
        System.out.println("this is alldispaly4 in gp");
    }
    static void allDispaly5(){
        System.out.println("this is static in gp");
    }

    GrandParent(){
        System.out.println("this grandparent constructor ");
    }
}
