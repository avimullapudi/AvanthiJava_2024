package Problems;

public class MethodsDemo {

    int i;
    String st;
   // int sum;

    void method1(){
       // method2();
        System.out.println("this is method1");
       // method2();


    }
//    void method2(){
//          System.out.println("this is method2");


    //}
    int mul(int num1,int num2){
        return num1+num2;
    }
    
}
class MethodDemo2{

    public static void main(String[] args) {
        
        MethodsDemo ob=new MethodsDemo();
        ob.method1();
       // System.out.println(ob.method1());
       int sum=ob.mul(3,5);
       //int sum2=ob.mul(3, 4);
       System.out.println(sum);
       //System.out.println(ob.addition(9,8));
    }
}
