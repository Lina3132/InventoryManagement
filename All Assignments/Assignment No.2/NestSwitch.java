import java.util.Scanner;

public class NestSwitch {
    public static void main(String[] args) {
        int l,b;
        float r;
        float arc,cc;
        int ar, pr;
        int ch1, ch2;

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Rectangle\n2. Circle");
        System.out.println("Enter your choise");
        ch1 = sc.nextInt();
        switch (ch1)
        {
            case 1:
            {
               System.out.println("Enetr length:");
               l = sc.nextInt();
               System.out.println("Enter Breadth");
               b = sc.nextInt();
               System.out.println("1.Area \n2. Perimeter");
               System.out.println("Select");
               ch2 = sc.nextInt();
               switch (ch2)
                {
                 case 1:
                 {
                    ar = l*b;
                    System.out.println("Area of rechtangle"+ar);
                    break;
                 }
                 case 2:
                 {
                    pr = 2*(l+b);
                    System.out.println("Perimeter of Rectangle"+pr);
                    break;
                 }   
                 default:
                 {
                    System.out.println("wrong choice..");
                 }  

               }
        break;   
         }    
            case 2:
            {
              System.out.println("Enter radius:");
              r = sc.nextFloat();
              System.out.println("1.Area \n2. Circum.");
              System.out.println("Select:");
              ch2 = sc.nextInt();
              switch (ch2) 
              {
                case 1:
                {
                    arc=(float) (3.14*r*r);
                    System.out.println("Area of circle:"+arc);
                    break;
                }
                case 2:
                {
                    cc= (float) (2*3.14*r);
                    System.out.println("");
                    break;
                }
                
              }
            }
               
        }
    }
}
