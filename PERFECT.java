public class PERFECT {
        public static void main(String[] args) {
            int number = 6;
            if (isPerfect(number)) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        }
    
        // Method to check if a number is perfect
        public static boolean isPerfect(int number) {
            return number == sumDivisors(number, 1);
        }
    
        // Recursive method to find the sum of proper divisors
        public static int sumDivisors(int number, int divisor) {
            if (divisor > number/2 ) {
                return 0;
            }
            if (number % divisor == 0) {
                return divisor + sumDivisors(number, divisor + 1);
            }
            return sumDivisors(number, divisor + 1);
        }
    
    
}
