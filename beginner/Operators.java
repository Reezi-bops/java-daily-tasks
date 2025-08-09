package beginner;
public class Operators {
    public static void main (String[] args) {
        int n1 = 20;
        int n2 = 40;

        System.out.println("20 + 40 = "+(n1+n2));
        System.out.println("20 * 40 = "+(n1*n2));
        System.out.println("40 - 20 = "+(n2-n1));
        System.out.println("40 / 20 = "+(n2/n1));

        int sumResult, absResult, mulResult, divResult;

        sumResult = n1 + n2;
        mulResult = n1 * n2;
        absResult = n2 - n1;
        divResult = n2 / n1;

        System.out.println("Sum Result "+sumResult);
        System.out.println("Multiply Result "+mulResult);
        System.out.println("Abstract Result "+absResult);
        System.out.println("Divided by Result "+divResult);
    }
}
