package Lab_4;

import java.util.Scanner;

public class Lab4_Task_2 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int first,last;
        System.out.print("Enter first number: ");
        first = s.nextInt();
        System.out.print("Enter second number: ");
        last = s.nextInt();
        System.out.print("Enter table number: ");
        char c = s.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println("Answer is: "+ first+last);
                break;
            case '-':
                System.out.println("Answer is: "+ (first-last));
                break;
            case '*':
                System.out.println("Answer is: "+ first*last);
                break;
            case '/':
                System.out.println("Answer is: "+ (float)(first)/(last));
                break;
            default:
                System.out.println("unkown symbol.");
                break;
        }
    }

}
