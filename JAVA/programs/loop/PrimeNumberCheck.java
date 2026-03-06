// 🚀 Next Challenge (Very Important)
// Write a Java program to check Palindrome Number.
// Example:
// Input: 121
// Output: Palindrome
// Input: 123
// Output: Not Palindrome
// Hint:
// original number == reversed number

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not");
        int num = s.nextInt();
int c =0;

        if(num <= 1){
            System.out.println("Not Prime");
            return;
        }
        for (int i=2; i<num; i++){
        c= num % i;
           
            if (c==0){
                System.out.println("not primary");
                break;
            }
        }
        if(c!=0){
        System.out.println("Primery");
        }
    }
}
