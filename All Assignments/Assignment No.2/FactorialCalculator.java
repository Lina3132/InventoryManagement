
public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 10; // Change this to the desired number

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
