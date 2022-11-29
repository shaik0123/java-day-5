package day5;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value how many times coin flip");
        int noOfTimesCoinFlip =sc.nextInt();
        int tailsCount = 0;
        int headsCount = 0;
        for(int i=1;i<=noOfTimesCoinFlip;i++){
            double randomValue = Math.random();
            System.out.println(randomValue);
            if(randomValue < 0.5){
                //System.out.println("tails");
                tailsCount++;
            }
            else{
                //System.out.println("heads");
                headsCount++;
            }
        }
        int perOfTails = tailsCount * 100 /noOfTimesCoinFlip;
        int perOfHeads = headsCount * 100 /noOfTimesCoinFlip;
        System.out.println("Tails percentage" + "=" +perOfTails);
        System.out.println("Heads percentage" + "=" +perOfHeads);
    }
}
