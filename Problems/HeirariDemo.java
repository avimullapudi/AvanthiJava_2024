package Problems;
class GrandFather{
    void assest(){
        System.out.println("I have land");
    }

}
class child1 extends GrandFather{
    void Child1(){
        System.out.println("this is child 1");
    }
}
class child2 extends GrandFather{
    void Child2(){
        System.out.println("this is child 2");
    }

    }
    class child3 extends GrandFather{
        void Child3(){
            System.out.println("this is child 3");
        }

        }
public class HeirariDemo {
    public static void main(String[] args) {
        child3 obj = new child3();
        obj.Child3();
        

    }
    
}
