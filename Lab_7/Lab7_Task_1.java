package Lab_7;

import java.util.Scanner;
class NegativeNumberException extends Exception{
    public void Ex(){
    System.out.println("Exception occured NUmber was negative");
    }
} 

public class Lab7_Task_1 {
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter any Positive number :");
  int a= sc.nextInt();
    try{
        if(a<0){
         throw new NegativeNumberException(); 
        }
    }
    catch(NegativeNumberException e){
        e.Ex();
    }
  }
  } 
