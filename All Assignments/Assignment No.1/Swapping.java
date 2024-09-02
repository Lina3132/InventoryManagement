public class Swapping {
    public static void main(String[] args) {
        // Declare and initialize two variables
        int a = 30;
        int b = 20;
        
        // Declare a third variable for swapping
        int temp;
        
        // Swap the variables
        temp = a;
        a = b;
        b = temp;
        
        // Print the values after swapping
        System.out.println("After swapping:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
