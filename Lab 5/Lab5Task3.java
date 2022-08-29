class Student{
    private String studentName;
    private String studentDegree;
    private String studentRollNo;
    private int studentyear;
    private int studentsemester;

    public void initMethod(String a,String b,String c,int d,int f){
        this.studentName=a;
        this.studentDegree=b;
        this.studentRollNo=c;
        this.studentyear=d;
        this.studentsemester=f;
    }
    public void displayMethod(){
        System.out.println("Name :"+this.studentName);
        System.out.println("Depatment :"+this.studentDegree);
        System.out.println("RollNO:"+this.studentRollNo);
        System.out.println("Year :"+this.studentyear);
        System.out.println("Semester"+this.studentsemester);
    }

    Student(String a,String b,String c,int d,int f){
        this.studentName=a;
        this.studentDegree=b;
        this.studentRollNo=c;
        this.studentyear=d;
        this.studentsemester=f;
    }
}

public class Lab5Task3 {
    public static void main(String[] args) {
    Student S1=new Student("Mubashir Ali","Software Engineering","21SW071",1,2);
    S1.initMethod("Mubashir Ali","Software Engineering","21SW071",1,2);
    S1.displayMethod();
    }
}
