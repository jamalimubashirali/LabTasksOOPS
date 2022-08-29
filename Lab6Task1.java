import java.util.*;
public class Lab6Task1 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a= sc.nextInt();
        boolean b=true;
        for(int i=0;i< array.length;i++){
            if(a==array[i]) {
                System.out.println("The position is " + i);
                b = false;
                break;
            }
        }
        if(b==true){
            System.out.println("Value not found in array");
        }
    }
}
