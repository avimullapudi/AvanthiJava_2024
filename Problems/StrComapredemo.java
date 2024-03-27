package Problems;

public class StrComapredemo {
    public static void main(String[] args) {
        String st1="Hello";
        String st2= "hello1";
        String st3= "Bye";
        String str=new String("Hello");
        System.out.println(str.equals(st2)); //equals method - dont check abt memory allocation
        System.out.println(str==st2); //==operator- check memory allocation and content
        System.out.println(st1.compareTo(st2));//compareto- if str1==str2->0;str1>str2->+;str1<str2->-ve
        
    }
    
}
