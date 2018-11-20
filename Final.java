package pkgfinal;

import java.util.Scanner;
public class Final {
public static String error;
public static String choice;
public static int index;
public static int i;
public static int elem;
    
public static void main(String[] args) {
      display(); 
      
    }
    public static void display(){
        Scanner sc = new Scanner(System.in);
        error = "error";
        while(!"correct".equals(error)){
            System.out.println("What do you want to get?Factorial/Fibonacci");
            choice = sc.nextLine();
            
            if(choice.equalsIgnoreCase("factorial")){
            error = "correct";
            factorial();
            }
            else if(choice.equalsIgnoreCase("fibonacci")){
            error = "correct";
            fibonacci();
            }
            else{
                System.out.print("");
            }
        }
   
    }
    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Index: ");
        index = sc.nextInt();
        
        int arr[] = new int[index];
            System.out.println("Enter Elements: ");
            for(i = 0; i<index; i++){
            elem = sc.nextInt();
             arr[i]=elem;
            }
            System.out.println("");
            for(i=0;i<index;i++){
                System.out.print("f("+arr[i]+")\t");
            }
            System.out.println("");
            fact(arr);
    }
    public static int[] fact(int[] arr){
    for(i=0;i<arr.length;i++){
    int factor = 1;
    for(int k=1;k<=arr[i];k++){
    
        factor = factor*k;
    }
    arr[i]=factor;
        System.out.print(arr[i]+"\t");
    }
    return arr;
    
    
    }
    public static void fibonacci(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Index: ");
        index = sc.nextInt();
        
        int arr[]= new int[index];
        System.out.println("Enter Elements: ");
            for(i =0;i<index;i++){
             elem = sc.nextInt();
             arr[i]= elem;
           }
           
            for(i=0;i<index;i++){
                System.out.print("f("+i+")\t");
           }
          
            System.out.println("");
            for(i=0;i<index;i++){
                System.out.print(fibo(arr[i])+"\t");
            }
            System.out.println("");
            
    }
            public static int fibo(int number){
                if(number<=1){
                    return number;
                }
                else
                    return fibo(number-1)+fibo(number-2);
            
            
            }
}
