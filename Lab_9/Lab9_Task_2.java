package Lab_9;

class Mother{
    public void display(){
        System.out.println("I am Mother Class!");
    }
}

class Doughter extends Mother{
    public void display(){
        System.out.println("I am Doughter class!");
    }
}

public class Lab9_Task_2{
    public static void main(String[] args) {
        Doughter d = new Doughter();
        d.display();
    }
}

