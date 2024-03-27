package Problems;

public class ThrowDemo {
    static void validate(int age){
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            throw new ArithmeticException("Not Eligible to vote");
        }
    }
    public static void main(String[] args) {
        validate(19);
    }
    
}
