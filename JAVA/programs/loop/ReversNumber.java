import java.util.Scanner;
public class ReversNumber {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter minimun 3 digit number");
        int a= s.nextInt();
        int b =String.valueOf(a).length();
        int e=a;
        int c=0;
        for(int im = b; im >= 1; im--){
            int d = a%10;
            c = c*10+d;
            a=a/10;
     
         }
         System.out.println("Revers:" +c+ " "+"Original: "+e);
  
        s.close();
    }
}



// revers number using while loop 

// import java.util.Scanner;
// public class ReversNumber {
//     public static void main(String[]args){
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter minimun 3 digit number");
//         int a= s.nextInt();
//         int b =String.valueOf(a).length();
//         System.out.println(b);
//         int c=0;
//         for(int im = b; im >= 0; im--){
//             c = a;
//           System.out.println(c);
//          }
//     System.out.println(c);
//         s.close();
//     }
// }
