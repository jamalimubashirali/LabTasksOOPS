package Lab_9;

interface Animal{
    public void walks();
    public void eats();
    public void lives();
}

class Mamals implements Animal{
    private String walk;
    private String eat;
    private String lives;

    public void walks(){
        System.out.println("Walks on " + walk);
    }

    public void eats(){
        System.out.println("Eats "+ eat);
    }

    public void lives(){
        System.out.println("Lives in "+ lives);
    }

    Mamals(String legs,String food,String life){
        this.walk=legs;
        this.eat= food;
        this.lives=life;
    }
}

final class Hourse extends Mamals{
    Hourse(){
        super("Four Legs", "Grass", "Forests");
    }
}

public class Lab9_Task_3 {
    public static void main(String[] args) {
        Hourse H = new Hourse();
        H.walks();
        H.eats();
        H.lives();
    }
}

