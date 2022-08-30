import java.util.*;
class InvalidPasswordException extends Exception{
    public void Ex(){
    System.out.println("Password is univlaid. Exceptin Occured");
    }
} 

public class Lab7Task3 {
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  String a= sc.nextLine();
  boolean b=true;
    try{
        for(int i=0;i<a.length();i++){
          if(a.length()<8||a.contains("!")){
            b=false;
            throw new InvalidPasswordException();
            
          }
        }
    }
    catch(InvalidPasswordException e){
        e.Ex();
    }
    if(b==true)
    System.out.println("Password is valid");
  }
  } 

