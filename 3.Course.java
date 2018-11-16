package nestedif;
import java.util.*;

public class NestedIf {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       
        System.out.print("What is your Course? ");
        String course = sc.next();
       
       if(course.equalsIgnoreCase("IT")){
           System.out.println("Major: ");
           String m = sc.next();
           
           if(m.equalsIgnoreCase("NetSec")){
               System.out.print("Your Major is Network and Security");
           }
           else if(m.equalsIgnoreCase("WebDev")){
               System.out.print("Your Major is Web Development");
           }
           else if(m.equalsIgnoreCase("ERP")){
               System.out.print("Your Major is Enterprise");
           }else{
               System.out.print("N/A");
           }
          
       }
       else if(course.equalsIgnoreCase("CS")){
           System.out.print("Major: ");
           String mm = sc.next();
           
           if (mm.equalsIgnoreCase("MobDev")){
               System.out.print("Your Major is Mobile Development");
           }
           else if(mm.equalsIgnoreCase("DigiArts")){
               System.out.print("Your Major is Digital Arts");
           }
           else if(mm.equalsIgnoreCase("Ani")){
               System.out.print("Your Major is Animation");
           }else{
               System.out.print("N/A");
           }
       }
       else if(course.equalsIgnoreCase("BSDA")){
           System.out.print("BSDA");
       }
       else{
           System.out.print("N/A");
       }
       

}
}

