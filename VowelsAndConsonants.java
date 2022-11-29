package day5;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the alphabet");
        char[] ch = sc.next().toCharArray();
        switch (ch[0]){
            case 'a' :
                System.out.println("is a vowel");
                break;
            case 'e':
                System.out.println(" is a vowel");
                break;
            case 'i':
                System.out.println(" is a vowel");
                break;
            case 'o':
                System.out.println(" is a vowel");
                break;
            case 'u':
                System.out.println("is a vowel");
                break;
            default:
                System.out.println("is a  consonant");
        }

    }
}
