package Lab_7;

public class Lab7_Task_2 {
    public static void main(String[] args){
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
