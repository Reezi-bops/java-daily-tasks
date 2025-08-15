package beginner;
import java.util.Scanner;

public class FibonacciLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms (N): ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        long a = 0, b = 1;


        System.out.print("Fibonacci sequence: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a);
            if (i != n) System.out.print(", ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}