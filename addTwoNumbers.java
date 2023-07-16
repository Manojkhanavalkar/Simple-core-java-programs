import java.util.Scanner;

class addTwoNumbers{
    public static void main(String args[])
    {
        System.out.print("Enter two numbers=");
        Scanner obj= new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int sum=a+b;
        System.out.println("sum of two numbers="+sum);
        obj.close();
    }
}