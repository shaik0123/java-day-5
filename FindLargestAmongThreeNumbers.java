package day5;

public class FindLargestAmongThreeNumbers {
    public static void main(String[] args) {
        int a = 44;
        int b = 11;
        int c = 45;
        if(a > b){
            if ( a > c){
                System.out.println(a  +"a is greater number");
            }
        }
        if(b > a){
            if(b > c){
                System.out.println(b  +"b is greater number");
            }
        }
        if(c > a){
            if(c > b){
                System.out.println(c  +" c is greater number");
        }
        }
    }
}