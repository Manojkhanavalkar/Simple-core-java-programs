import java.util.*;
public class ColorButton {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values b/w 1 2 and 3");
        int button =sc.nextInt();
        do {
            
            switch (button) {
            case 1:System.out.println("Green light");
                break;
            case 2:System.out.println("Blue light");
                break;
            case 3:System.out.println("Yellow light");
                break;
            case 4:System.exit(0);
            default:System.out.println("Wrong number!!!!");
                break;
            }
            System.out.println("Enter values b/w 1 2 and 3");
             button =sc.nextInt();
        } while (button!=4);
        sc.close();
    }
}
