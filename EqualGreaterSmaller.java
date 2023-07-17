import java.util.*;
public class EqualGreaterSmaller {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("No is equal");
        }
        else if(a>b){
            System.out.println("A is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
        sc.close();
    }
    
}
