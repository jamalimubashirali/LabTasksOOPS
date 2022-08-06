class Calculator{
    public int addNumbers(int fNo,int sNo){
        return fNo+sNo;
    }

    public int subtractNumbers(int fNo,int sNo){
        return fNo+sNo;
    }

    public int multiplyNumbers(int fNo,int sNo){
        return fNo+sNo;
    }

    public float divideNumbers(float fNo,float sNo){
        return fNo+sNo;
    }
}

public class Lab5Task1 {
    public static void main(String[] args) {
        Calculator C1=new Calculator();
        int a=C1.addNumbers(774,88);
        int b=C1.subtractNumbers(34,24);
        int c=C1.multiplyNumbers(65,3);
        float f=C1.divideNumbers(86,9);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(f);
    }
}
