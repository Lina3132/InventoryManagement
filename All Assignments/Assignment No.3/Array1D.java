import java.util.Scanner;

public class Array1D {
     public static void main(String[] args) {
          int a[]=new int[5]; int sum=0; double avg;
          Scanner r=new Scanner(System.in);
          System.out.println("Enter array element:");
          for( int i=0; i<5; i++)
          {
             a[i]=r.nextInt();
          }
          for( int i=0; i<5; i++)
          {
             System.out.println(a[i]+" ");
          }
          for( int i=0; i<5; i++)
          {
              sum=a[i]+sum;
          }
          avg=sum/5;
          System.out.println(sum+" "+avg);
     }
    
}