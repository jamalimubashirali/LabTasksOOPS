import java.util.*;
class NegativeNumberException extends Exception{
    public void Ex(){
    System.out.println("Exception occured NUmber was negative");
    }
} 

public class Lab7Task1 {
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
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
