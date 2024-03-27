package Problems;

public class UnCheckedExceptionDemo {
    public static void main(String[] args) {
        //occurs in run time 
        //Arithmetic Exception
        int a=10;
        int b= 0;
        int div = a/b;
        System.out.println(div);
        //nullpointer exception
        String str=null;
        System.out.println(str.length());
        //NumberFormat Exception
        String s= "Alexa";
        int i = Integer.parseInt(s);
        System.out.println(i);
//ArrayIndexOutofBound Exception
int arr[]= new int[3];
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
for(int i : arr){
    System.out.println(i);

}
//StringIndexOutofBoundException
String s="Example";
System.out.println(s.substring(2,8));
    }
    
}
