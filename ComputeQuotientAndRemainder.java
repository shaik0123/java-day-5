package day5;

public class ComputeQuotientAndRemainder {
    public static void main(String[] args) {
        int divisor = 5;
        int dividend= 20;
        int remainder = dividend % divisor ;
        int quotient = dividend / divisor;
            System.out.println("remainder is   " + remainder );
        System.out.println("quotient is  " + quotient);
    }
}
