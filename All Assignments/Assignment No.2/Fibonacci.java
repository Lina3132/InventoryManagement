// 0 1 1 2 3 5 8 13

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       int term, a=0, b=1, c; 
       System.out.println("Enter term");
       Scanner r=new Scanner(System.in);
       term = r.nextInt();

     // logic 
     for(int i=1; i<=term; i++ )
     {
       System.out.println(a+" ");
       c = a+b;
       a = b;
       b = c;
     }
    }
}
