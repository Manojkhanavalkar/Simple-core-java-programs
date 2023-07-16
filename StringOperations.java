 import java.util.Scanner;
 class StringOperations {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string=");
        String str=obj.next();
        System.out.println("The string you entered is "+str);
        System.out.println("Finding reverse of string ");
        int len=str.length();
        char ch;
        String rev="";
        for(int i=len-1;i>=0;i--)
        {
            // System.out.println(i);
            ch=str.charAt(i);
            rev=rev+ch;
        }
        System.out.println("Reversed string="+rev);
        if(str.equals(rev))
        {
            System.out.println("The string is pallindrom");
        }
        else{
            System.out.println("The string is not pallindrom");
        }
        obj.close();
    }
}
