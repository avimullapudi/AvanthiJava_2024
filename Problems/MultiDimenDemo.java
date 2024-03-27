package Problems;
import java.util.*;

public class MultiDimenDemo {
    public static void main(String[] args) {
        
        int i[][]=new int[3][3];// we have to mention rows and we can leave columns

        i[0][0]=1;
        i[0][1]=2;
        i[0][2]=3;

        i[1][0]=4;
        i[1][1]=5;
        i[1][2]=6;

        i[2][0]=7;
        i[2][1]=8;
        i[2][2]=9;
        Scanner sc = new Scanner(System.in);
       // int i[][]= sc.nextInt();

        // for(int j=0;j<arr.length;j++){  // when it comes for loop we print array reverse but
        
        //     arr[j]=ob.nextInt();
           
        //     System.out.println(arr[j]);      // not possible in for each loop
        //    }// here we are desaling with index
        

       // int k[][]={{2,2,2},{3,3,3},{5,5,5}};


        for(int l=0; l<i.length;l++){//rows
            for(int m=0;m<i.length;m++){//columns
                i[l][m]=sc.nextInt();

                System.out.print(i[l][m]+" ");
            }
            System.out.println();
        }

    }
    
}

    
    
