package Problems;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        //try-catch exception
    //     try{
    //         int data=20/0;

    //     }
    //     catch(ArithmeticException e){
    //         System.out.println(e);
    //     }
    //     System.out.println("remaining code");
    //Multiple catch exception
    try{
        int a=10/0;
        String s= null;
        System.out.println(s.length());


    }
    catch(ArithmeticException e){
        System.out.println(e);
    }
     
     catch(NullPointerException e ){
        System.out.println(e);

     }
     finally{
        System.out.println("Rest of the code");
     }
    
}
}

