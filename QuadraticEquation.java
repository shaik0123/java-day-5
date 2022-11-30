package day2;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        int root1,root2;
        int a = 15;
        int b = 68;
        int c = 3;
        int  delta = b*b -4*a*c;
        int sqrt = (int) Math.sqrt(delta);
        if(delta>0){
            root1 = (int) ((-b + sqrt(delta))/(2*a));
            root2 = (int) ((-b - sqrt(delta))/(2*a));
            System.out.println("roots are :"+root1 + "and "+root2);
        } else if (delta == 0){
            System.out.println("root is :"+(-b + sqrt)/(2*a));

        }
    }
}
