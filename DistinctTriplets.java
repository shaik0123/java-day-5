package day5;

import java.util.Scanner;

public class DistinctTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+14;j< arr.length-1;j++){
                for(int k=j+1;k< arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        System.out.println("valid triplets is " +arr[i] +" "+arr[j] +" and " +arr[k]);
                    }
                }
            }
        }
    }
}
