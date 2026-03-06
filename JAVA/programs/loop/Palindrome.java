//  🚀 Next Challenge (Very Important)
// Write a Java program to check Palindrome Number.
// Example:
// Input: 121
// Output: Palindrome
// Input: 123
// Output: Not Palindrome
// Hint:
// original number == reversed number
 
 
 import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter minimun 3 digit number");
        int a= s.nextInt();
        int b =String.valueOf(a).length();
        System.out.println(b);
        int e =a;
        int c=0;
        // for(int im = b; im >= 1; im--){
        //     int d = a%10;
        //     c = c*10+d;
        //     a=a/10;
     
        //  }

        // using while loop 
        while(a!=0){
            int d = a%10;
            c = c*10+d;
            a=a/10;
        }
         System.out.println("Revers:" +c+ " "+"Original: "+e);
         if (c==e){
            System.out.println("Palindrome Number");
         }else{
    System.out.println("Not Palindrome Number");
         }
        s.close();
    }
}


