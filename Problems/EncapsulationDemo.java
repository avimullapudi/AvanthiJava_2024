package Problems;

public class EncapsulationDemo {
    //private int l=88;
    private int i=10;
    private String st="Avanthi";


    public int getI(){
        return i;
    }
    public String getSt(){
        return st;
    }
    public void setI(int i){
        System.out.println("this is setter method");
        this.i=i;

    }
}
class EncapsulationDemo2{



    public static void main(String[] args) {
        EncapsulationDemo ob=new EncapsulationDemo();

       System.out.println(ob.getI()); // we cannot acccess private variables
       //ob.setI(33);
      //System.out.println(ob.setI(33));  
      System.out.println(ob.getSt());


    }
}
