package Lab_5;

class Employee{
    static String companyName;
    private String employeeName;
    private int employeeid;
    private float employeeSalary;
    private String employeeDesignation;

    Employee(){
        System.out.println(companyName);
    }

    public void setEmployeeData(String b,String c,int d,float f){
        this.employeeName=b;
        this.employeeDesignation=c;
        this.employeeid=d;
        this.employeeSalary=f;
    }

    public void getEmployeeData(){
        System.out.println("Id :"+this.employeeid);
        System.out.println("Name :"+this.employeeName);
        System.out.println("Designation :"+this.employeeDesignation);
        System.out.println("Salary :"+this.employeeSalary);
    }
}

public class Lab5_Task_2 {
    public static void main(String[] args) {
        Employee.companyName="Google";
        Employee e1= new Employee();
        e1.setEmployeeData("Mubashir Ali","Software Engineer",1008,7000000);
        e1.getEmployeeData();
        Employee e2= new Employee();
        e2.setEmployeeData("Fahad Ali","Web Devloper",6779,5600000);
        e2.getEmployeeData();
        Employee e3= new Employee();
        e3.setEmployeeData("Muhammmad Ahsan","Security Engineer",4589,8600000);
        e3.getEmployeeData();

    }
}
