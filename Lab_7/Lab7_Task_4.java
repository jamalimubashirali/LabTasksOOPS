package Lab_7;

public class Lab7_Task_4{
    public static void main(String[] args){
        int a=6;
        try{
            System.out.println(a/0);
        }
        catch(ArithmeticException e){
            System.out.println("Can't devide by zero");
            System.out.println(e.toString());
        }
    } 
}
