package Problems;

abstract public class AbstrDemo {

    abstract void method1();
    abstract void method6();


    void method2(){
        System.out.println("this methdo2");

    }
   // private abstract void method4();
   AbstrDemo(){
    System.out.println("this is constructor");
   }
   public static void main(String[] args) {

    
   }
    
    
}

abstract class sample1 extends AbstrDemo{
    abstract void disp();

} 
class sample extends sample1{

    @Override
    void disp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'disp'");
    }

    @Override
    void method1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'method1'");
    }

    public static void main(String[] args) {
        AbstrDemo ob1=new AbstrDemo() {
            
        };
    }

}
