import java.util.Scanner;

public class Array2D {
   public static void main(String[] args) {
       int a[][]= new int[2][2];
       int b[][]= new int[2][2];
       int c[][]= new int[2][2];
       Scanner r=new Scanner(System.in);
       System.out.println("Enter first matrix element:");

      //  stored input in array
       for( int i=0; i<2; i++) //rows//
       {
          for( int j=0; j<2; j++) //column//
          {
            a[i][j]=r.nextInt();
          }
       }
       System.out.println("Enter Second matrix element:");
       for( int i=0; i<2; i++) //rows//
       {
          for( int j=0; j<2; j++) //column//
          {
            b[i][j]=r.nextInt();
          }
       }
       
      //  print the input
       for( int i=0; i<2; i++) //rows//
       {
          for( int j=0; j<2; j++) //column//
          {
            System.out.println(a[i][j]+" ");
          }
          System.out.println("\n");
       }

       for( int i=0; i<2; i++) //rows//
       {
          for( int j=0; j<2; j++) //column//
          {
            System.out.println(b[i][j]+" ");
          }
          System.out.println("\n");
       }

      //Addition of element   
       for( int i=0; i<2; i++) //rows//
       {
          for( int j=0; j<2; j++) //column//
          {
            c[i][j]= a[i][j] + b[i][j];
            System.out.println( c[i][j]+" ");
          }
          System.out.println("\n");
       }
    } 

}
