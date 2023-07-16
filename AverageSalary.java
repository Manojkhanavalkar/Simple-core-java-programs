import java.util.Scanner;

public class AverageSalary {
    public static void main(String args[])
    {
        float gross_salary,income_tax,public_pro_fund,profession_tax;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the gross salary");
        gross_salary=sc.nextFloat();
        System.out.println("Enter income tax percentage:");
        income_tax=sc.nextFloat();
        System.out.println("Enter the public provident fund %:");
        public_pro_fund=sc.nextFloat();
        System.out.println("Enter professional tax percentage");
        profession_tax=sc.nextFloat();
        float it,ppf,pt,salary_in_hand;
        it=(income_tax/100)* gross_salary;
        ppf=(public_pro_fund/100)*gross_salary;
        pt=(profession_tax/100)*gross_salary;
        salary_in_hand=gross_salary-it-ppf-pt;
        System.out.println("The salary in hand= "+salary_in_hand);
        sc.close();
    }
}
