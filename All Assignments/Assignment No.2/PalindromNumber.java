import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        
        int n, s=0, c, r;
        System.out.println("Enter any Number:");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();

        // Logic for check the palindrom Number.
        c = n;
        while (n>0)
        {
            // to find the remainder (r)
            r = n % 10;
            s = (s*10) + r;
            n = n / 10;
        }
        if (c==s) 
        {
          System.out.println("Palindrom Number");  
        }
        else
        {
            System.out.println(" Not Palindrom Number");  
        }

    }
    
}