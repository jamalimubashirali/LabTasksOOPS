package Lab_3;
import java.util.Scanner;
public class Lab3_Task1 {
    public static void main(String[] args){
        int i=1;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Odd     Even");
        while(i<=n)
        {
            if(i%2!=0){
                System.out.print(i);
                i++;
            }
            else{
                System.out.println("         "+i);
                i++;
            }
        }
    }
}
