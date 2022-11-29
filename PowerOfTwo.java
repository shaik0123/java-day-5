package day5;

public class PowerOfTwo {
    public static void main(String[] args) {
        int power = 4;
        for(int i=1;i<=power;i++){
            int value = 1;
            for (int j=1;j<=i;j++){
                value = value * 2;
            }
            System.out.println("2 power to  " +i+ " is  " +value);
        }
    }
}
