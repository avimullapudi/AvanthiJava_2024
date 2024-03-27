package Problems;
import java.util.*;

public class ArrayDemo {
    public static void main(String[] args) {
        

        int Arr [];    // declration of array

        String str[]=new String[3]; //instantation of array

        int i[]=new int[4];// for instatation we have to decalre the size of an array

    //    str[0]="Avi";   // installization of an array
    //    str[1]="Karthik";
    //    str[2]="Charan";
    //    str[3]="Lahari";

       // all three in one line

       int arr[]={1,2,3,4,5,6,7,8,9};

       // how to acccess array elements 

       //for each loop or for loop
       Scanner ob= new Scanner(System.in);

       for(int j=0;j<arr.length;j++){  // when it comes for loop we print array reverse but
        
        arr[j]=ob.nextInt();
       
        System.out.println(arr[j]);      // not possible in for each loop
       }// here we are desaling with index
       System.out.println(arr[5]);

       //for each loop
       for(int k :arr){
        System.out.println(k); // here we are dealing with value int k=1
       }

       




    }
    
}

    

