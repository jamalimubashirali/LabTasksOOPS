package Lab_4;
import java.util.Scanner;
public class Lab4_Task_3 {
    public static void main(String [] args){
        boolean b=false;
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter Any Number :");
        a = sc.nextInt();
        for(int i=2;i<=a-1;i++){
            if(a==2){
                System.out.println("Prime Number.");
            }
            else if(a%i==0){
                b=true;
                break;
            }
        }
        if(!b){
            System.out.println("Prime number.");
        }
        else{
            System.out.println("Not prime number.");
        }
    }

}
