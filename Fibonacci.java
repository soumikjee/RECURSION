
public class Fibonacci {
    
    public static void main(String[] args) {
        int n = 8; // Number of terms to display
        print(n, 0);
    }

    // Method to print Fibonacci series up to n terms
    public static void print(int n, int currentTerm) {
        if (currentTerm < n) {
            System.out.print(fibonacci(currentTerm) + " ");
            print(n, currentTerm + 1);
        }
    }

    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
