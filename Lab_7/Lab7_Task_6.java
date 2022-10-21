package Lab_7;

import java.util.Scanner;

class InvalidAgeExcption extends Exception{
    public void eligible(){
        System.out.println("The person is eligible for voting!");
    }
    public void notEligible(){
        System.out.println("The person is not eligible for voting!");
    }
}

public class Lab7_Task_6{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int a =sc.nextInt();
    InvalidAgeExcption e1 = new InvalidAgeExcption();
    boolean b= true;
    try {
        if(a<18){
            b=false;
            throw new InvalidAgeExcption();
        }
    }catch (InvalidAgeExcption e){
            e.notEligible();
    }
    if(b==true){
        e1.eligible();
    }
    }
}
