package Problems;

public class ThisDemo1 {

    int i=10;
    String st="Avanthi";


   void  Method1(){

    int i=60;    // this keyword represents instance variable of current object

    System.out.println(i); // output:60-->first preference to local variable 
    System.out.println(this.i);  // this prints instance variable  


    }
    
}
