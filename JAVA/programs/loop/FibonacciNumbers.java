// Write a Java program that prints Fibonacci series up to N numbers.
// Example input:
// Enter N: 7
// Output:
// 0 1 1 2 3 5 8
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number");
        int in=s.nextInt();
        int a =0;
        int b=1;
        int i=1;
        // FOR LOOP 
//         for (int i=1;i<=in;i++){
//             int c= a;
// System.out.println(c);
//             c=a+b;
//             b=a;
//             a=c;  
//         }
// WHILE LOOP 
while(i<=in){
 
    System.out.println(a);
       int c =a+b;
       a=b;
       b=c;
       i++;
}
s.close();
    }
}
