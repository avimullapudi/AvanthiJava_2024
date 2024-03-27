package Problems;

public class StaticBlockDemo {
    static int i=20;
    int j =5;
    static{
        i=50;
        System.out.println("static block"); // when we run the class then it  automatically prints without callong 

    }
    

    public static void main(String args[])
    {
        System.out.println(StaticBlockDemo.i + " " +i ) ;
    }
}
