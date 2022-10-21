package Lab_7;

public class Lab7_Task_5{
    public static void main(String[] args){
        int[] a= new int[4];
        a[0]=1;
        a[1]=7;
        a[2]=0;
        a[3]=8;
        try {
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index given doesn't exist in array");
            System.out.println(e.toString());
        }
    }
}
