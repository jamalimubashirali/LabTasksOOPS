package Lab_9;

interface Vehicle{

    public void setColor(String a);
    public void setWeight(int b);
    public void setModel(String c);

    public String getModel();
    public String getColor();
    public int getWeight();

    public void accelerate();

    public void decelerate();

}


class Bus implements Vehicle{
    private String color;
    private int weight;
    private String model;
    @Override
    public void setColor(String a) {
        this.color=a;
    }

    @Override
    public void setWeight(int b) {
        this.weight=b;
    }

    @Override
    public void setModel(String c) {
        this.model=c;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void accelerate() {
        System.out.println("Bus is Accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("Bus is Decelerating");
    }
}

class Car implements Vehicle{
    private String color;
    private int weight;
    private String model;
    @Override
    public void setColor(String a) {
        this.color=a;
    }

    @Override
    public void setWeight(int b) {
        this.weight=b;
    }

    @Override
    public void setModel(String c) {
        this.model=c;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void accelerate() {
        System.out.println("Car is Accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("Car is Decelerating");
    }
}

class Truck implements Vehicle{
    private String color;
    private int weight;
    private String model;
    @Override
    public void setColor(String a) {
        this.color=a;
    }

    @Override
    public void setWeight(int b) {
        this.weight=b;
    }

    @Override
    public void setModel(String c) {
        this.model=c;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void accelerate() {
        System.out.println("Bus is Accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("Bus is Decelerating");
    }
}

class SchoolBus extends Bus{
    SchoolBus(){
        System.out.println("Mehran School Bus");
    }
}

class HondaCar extends Car{
    HondaCar(){
        System.out.println("Honda Civic");
    }
}

class VigoTruck extends Truck{
    VigoTruck(){
        System.out.println("Vigo Truck");
    }

}

public class Lab9_Task_1 {
    public static void main(String[] args) {
        SchoolBus sc = new SchoolBus();
        sc.setColor("Yellow");
        sc.setWeight(500);
        sc.setModel("Vigo Fortuner");
        System.out.println("SchoolBus color is "+ sc.getColor());
        System.out.println("SchoolBus Weight is +"+sc.getWeight()+" pounds.");
        System.out.println("SchoolBus Model is "+sc.getModel());
        sc.decelerate();

        HondaCar hc = new HondaCar();
        hc.setColor("Black");
        hc.setWeight(40);
        hc.setModel("Honda Civic 2022");
        System.out.println("HondaCar's Color is "+hc.getColor());
        System.out.println("HondaCar's Weight is "+hc.getWeight()+" ponds");
        System.out.println("HondaCar's Model is "+hc.getModel());
        hc.accelerate();

        VigoTruck vt = new VigoTruck();
        vt.setColor("Hot Red");
        vt.setWeight(5000);
        vt.setModel("Daewoo");
        System.out.println("VigoTruck Color is "+vt.getColor());
        System.out.println("VigoTruck wight is "+vt.getWeight()+" pounds");
        System.out.println("VigoTruck model is "+vt.getModel());
        System.out.println("Pushing Breaks");
        vt.decelerate();
    }
}

