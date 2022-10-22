package Lab_8;

class MyThread extends Thread{
    private int a;

    @Override
    public void run() {
        super.run();
        int i=1;
        while(i>0){
            a+=2;
            System.out.print(a+" ");
            i++;
            if(i%30==0){
                System.out.println();
                try{
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
}
public class Lab8_Task_1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
