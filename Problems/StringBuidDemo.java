package Problems;

public class StringBuidDemo {
    public static void main(String[] args) {
        //StringBuffer()-it will create empty string buffer and have default capacity is 16
        //StringBuffer(int capacity)-will create empty string buffer and gives the capacity as we given
        //StringBuffer(String str)-will create string buffer with specified string
        StringBuilder obj= new StringBuilder("hello");
        System.out.println(obj.append("java"));//append -adds
        System.out.println(obj.insert(4, "hi"));//oinsert
        System.out.println(obj.replace(4, 7, "o "));
        System.out.println(obj.reverse());
        System.out.println(obj.delete(0, 5));
        System.out.println(obj.reverse());
        System.out.println("---------");
        StringBuilder obj1= new StringBuilder();
        // (oldcpacity*2)+2
        System.out.println(obj1.capacity());
        System.out.println(obj1.append("java is a programming language is good"));//30
        System.out.println(obj1.capacity());
        //System.out.println(obj1.length());
        System.out.println("-------------");
        StringBuilder obj3= new StringBuilder(20);
        System.out.println(obj3.capacity());
        obj3.ensureCapacity(21);
        System.out.println(obj3.capacity());
        obj3.ensureCapacity(45);
        System.out.println(obj3.capacity());
    }
    
}

    

