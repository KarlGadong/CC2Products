package multidarray;
import java.util.*;
public class MultiDArray {

   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input a Number: ");
        int x=sc.nextInt();
        int[]ar= new int[x];
        int i;
 
        for(i=0;i<ar.length;i++){
            System.out.print("index"+i+"\t");
            ar[i]=sc.nextInt();
            System.out.println("");
        }
        System.out.println("Elements are: "+i);
        
      //  String [][]names={{"karl","gadong"},{"jhun","bidang"},{"daji","dulay"},{"jd","van"}};
        
      //  for(int a = 0;a<names.length;a++){
         //   System.out.println("row"+a);
    
     //   for(int b=0;b<names[a].length;b++){
        //    System.out.println(names[a][b]+"\t");
      //  }
      //      System.out.println("");
     //   }
    
    }
    
}
