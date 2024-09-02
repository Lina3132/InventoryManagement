public class SwapClass {
    public static void main(String[] args) {
        // Declare and initialize two variables
        int a = 5;
        int b = 10;
        
        // Swap the variables without using a third variable
        a = a + b; // a now becomes 15
        b = a - b; // b now becomes 5 (original value of a)
        a = a - b; // a now becomes 10 (original value of b)
        
        // Print the values after swapping
        System.out.println("swapping: a = " + a + ", b = " + b);
    }
}

