// 🚀 Next Level Question (Important)
// Can you modify your factorial program so that:
// If input = 0 → print "Factorial = 1"
// If input < 0 → print "Invalid input"
// Otherwise calculate normally
// Try to write the full program yourself.

import java.util.Scanner;

public class Factorial{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        if(a<0){
            System.out.println("Invailed Number ");
        }else{
        int fact =1;
        int i;
        for (i=1; i<=a; i++){
            fact = fact*i;
        }
        System.out.println("Factorial: " + fact);
    }
    sc.close();
}
}