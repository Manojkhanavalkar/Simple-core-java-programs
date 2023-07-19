class Employee{
    int id;
    String name;
    int salary;
    void acceptInfo(int i,String n,int sal){
        id=i;
        name=n;
        salary=sal;
    }
    void displayInfo(){
        System.out.println("Id="+id);
        System.out.println("Name="+name);
        System.out.println("Salary="+salary);
    }
}
public class EmployeeInfo {
    public static void main(String args[]){
        Employee e1=new Employee();
        e1.acceptInfo(102, "Rahul", 50000);
        e1.displayInfo();

    }
}
