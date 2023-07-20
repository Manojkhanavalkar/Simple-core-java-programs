import java.util.*;
class customer{
    int acnum;
    String name;
    float amt;
    void accept(){
        System.out.println("Enter the account number=");
        Scanner sc= new Scanner(System.in);
        acnum=sc.nextInt();
        System.out.println("Enter name=");
        name=sc.next();
        System.out.println("Enter account balance=");
        amt=sc.nextFloat();
       
    }
    float diposite(float a){
        amt=amt+a;
        return amt;
    }
    float withdraw(float w){
        if(w>amt){
            System.out.println("Invalid withdrwl!!");
            return amt;
        }
        else{
            amt=amt-w;
            return amt;
        }
    }
    float checkAccBalence(){
        return amt;
    }
}

public class BankingSystem {
    public static void main(String args[]){
        customer c= new customer();
        c.accept();
        
        int ch;
        while(true)
        {
            System.out.println("select one of following option:");
            System.out.println("1.Check balance");
            System.out.println("2.Diposite");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit ....");
            Scanner sc1=new Scanner(System.in);
            ch=sc1.nextInt();
            switch (ch) {
                case 1:float bal=c.checkAccBalence();
                        System.out.println("The balance in acc:"+bal);
                         break;
                case 2:System.out.println("Enter the amount to deposit=");
                        float a=sc1.nextFloat();
                        float balance=c.diposite(a);
                        System.out.println("balance in accout after deposition="+balance);
                        break;
                case 3:System.out.println("Enter the amont to withdraw:");
                        float w=sc1.nextFloat();
                        float balence=c.withdraw(w);
                        System.out.println("Balance after withdrawal="+balence);
                        break;
                case 4:sc1.close();
                    System.exit(0);
                        break;
            
                default:sc1.close();
                System.exit(0);
                    break;
            }
        }
        
    }
    
}
