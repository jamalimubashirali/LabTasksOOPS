package Lab_8;
class Storage{
    public static int counter;
}
class Counter extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0;i>=0;i++){
            Storage.counter=i;
            try{
                Thread.sleep(300);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }

    }
}

class Printer extends Thread{
    Storage store = new Storage();
    @Override
    public void run() {

        super.run();
        for(int i=0;i>=0;i++){
            System.out.print(Storage.counter+" ");
            try{
                Thread.sleep(300);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class Lab8_Task_2 {
    public static void main(String[] args) {
        Counter count = new Counter();
        Printer print = new Printer();
        print.start();
        count.start();
    }
}
