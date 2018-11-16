package calcu;

import java.util.*;
public class Calcu {

  
    public static void main(String[] args) {
       
       Scanner calc = new Scanner(System.in);
       int n1;
       int n2;
       int answer;
       String operator;
       
        System.out.print("Enter the First number: ");
        n1 = calc.nextInt();
        System.out.print("Enter the Second number: ");
        n2 = calc.nextInt();
        System.out.print("Select the order of operation:"
                + "\n[1]add"
                + "\n[2]subtract"
                + "\n[3]multiply"
                + "\n[4]divide"
                + "\n[5]modulo");
       operator = calc.next();
       
        if (operator.equals("+")|| operator.equals("add")) {
            answer = (n1 + n2);
            System.out.println("Answer:" + answer);
            } 
        else if  (operator.equals("-")||operator.equals("sub")) {
            answer = (n1 - n2);
            System.out.println("Answer:" + answer);
            } 
        else if (operator.equals("*")||operator.equals("multiply")) {
            answer = (n1 * n2);
            System.out.println("Answer:" + answer);
            } 
        else if (operator.equals("/")) {
            answer = (n1/n2);
            System.out.println("Answer:" + answer);
            } 
        else if(operator.equals("%")){
             answer = (n1%n2);
            System.out.println("Answer: " + answer);
        }
        else {
           
            System.out.println("");
        }


    }

}