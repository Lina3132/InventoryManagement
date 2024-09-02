public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int count = 0;

            // Check for factors
            for (int num = 1; num <= i; num++) {
                if (i % num == 0) {
                    count++;
                }
            }

            // A prime number has exactly two factors: 1 and itself
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}

