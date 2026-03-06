// 🎯 Next Logic Challenge (Very Important)
// Write a program to check:
// Armstrong Number
// Example:
// 153
// Calculation:
// 1³ + 5³ + 3³ = 153
// So output:
// Armstrong Number
// Try writing it without Googling.
// This problem is very important in interviews.

import java.util.Scanner;
public class ArmstorngNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Armstorng");
        int num = sc.nextInt();
        int len= String.valueOf(num).length();
        int d =num;
        int a,b,c=0;
        // USING FOR LOOP 
        // for (a=1;a<=len;a++){
            
        //     b=num%10;
            
        //     c=c+(b*b*b);
        //        System.out.println(c);
        //     num=num/10;
         
        // }
        // USING WHILE LOOP 
    //     while(num>0){
    //   b=num%10;
            
    //         c=c+(b*b*b);
    //            System.out.println(c);
    //         num=num/10;
    //     }

        // program for any digit number 

         // USING FOR LOOP 
        for (a=1;a<=len;a++){
            
            b=num%10;
            
            c=c+(int)Math.pow(b,len);
            //    System.out.println(c);
            num=num/10;
         
        }
        if(c==d){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
    
}
