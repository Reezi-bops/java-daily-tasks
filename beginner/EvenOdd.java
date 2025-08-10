package beginner;
import java.util.Scanner;

public class EvenOdd {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();

        System.out.println(n1 == 2 ? "Even" : "Odd");

        sc.close();

        //Day 2
    }
}
