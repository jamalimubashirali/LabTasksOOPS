package Lab_4;

import java.util.Scanner;

public class Lab4_Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Alphabet: ");
        char c= sc.next().charAt(0);
        switch (c) {
            case 'A':
                System.out.println("It is vowel.");
                break;
            case 'E':
                System.out.println("It is vowel.");
                break;
            case 'I':
                System.out.println("It is vowel.");
                break;
            case 'O':
                System.out.println("It is vowel.");
                break;
            case 'U':
                System.out.println("It is vowel.");
                break;
            case 'a':
                System.out.println("It is vowel.");
                break;
            case 'e':
                System.out.println("It is vowel.");
                break;
            case 'i':
                System.out.println("It is vowel.");
                break;
            case 'o':
                System.out.println("It is vowel.");
                break;
            case 'u':
                System.out.println("It is vowel.");
                break;

            default:
                System.out.println("It is consonent");
                break;
        }
    }

}
