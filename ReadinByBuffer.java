import java.io.*;

public class ReadinByBuffer {
    public static void main(String args[])throws Exception{
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        int emp_no;float emp_sal;
        String emp_name;
        String gender;
        System.out.println("Enter the employee id:");
        emp_no=Integer.parseInt(b.readLine());
        System.out.println("Enter the employee name:");
        emp_name=b.readLine();
        System.out.println("Enter the employee salary:");
        emp_sal=Float.parseFloat(b.readLine());
        System.out.println("Enter the Gender of employee M/F:");
        gender=b.readLine();
        System.out.println("id="+emp_no+" Name="+emp_name+" Salary="+emp_sal+"  Gender="+gender);

    }
}
