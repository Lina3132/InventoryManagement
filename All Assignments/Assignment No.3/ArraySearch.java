import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int a[]= new int[5]; int n, count=0;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter element in array");
        for(int i=0; i<a.length; i++)
        {
           a[i]=r.nextInt();
        }

        System.out.println("Array Element");
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]+" ");
        }
        // logic 
        System.out.println("Enter search element");
        n=r.nextInt();
        for(int i=0; i<a.length; i++)
        {
            if (a[i]==n) 
            {
                 count++;
            }
        }
        if (count>0)
        {
           System.out.println("Element is Present");
        }
        else
        {
            System.out.println("Element is Not Present");  
        }
    
         }
    }

