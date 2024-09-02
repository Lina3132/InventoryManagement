// input n=5
// power p=3
// 5*5*5 = 125
// n(number), p(power)

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
      int n, p, result=1;
      System.out.println("Enter No."); 
      Scanner ref=new Scanner(System.in);
      n=ref.nextInt();
      System.out.println("Enter Power");
      p=ref.nextInt();

      for(int i=1; i<=p; i++)
      {
        result=n*result;
      }
      System.out.println("Power"+result);
    }
}
