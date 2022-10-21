package Lab_3;
import java.util.Scanner;
public class Lab3_Task_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Strating point :");
        int s=sc.nextInt();
        System.out.println("Please Enter the Ending point :");
        int end=sc.nextInt();
        System.out.println("Enter the number for the table :");
        int n=sc.nextInt();
        for(int i=s;i<=end;i++){
            System.out.println(i+"*"+n+"="+i*n);
        }
    }

}
