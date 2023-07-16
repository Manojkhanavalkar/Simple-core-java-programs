import java.util.Scanner;

public class studen_info {
     static String name;
     
     public static String get_info()
     {
        System.out.println("Enter the name of student=");
        Scanner sc= new Scanner(System.in);
        name=sc.next();
        sc.close();
        return name;
     }
      public static void disp_info(String nm)
      {
        System.out.println("Sudent name is "+nm);
        return;
      }
    public static void main(String args[])
    {
       String n1=get_info();
       disp_info(n1);
    }
}