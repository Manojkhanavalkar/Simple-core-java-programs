class Counter{
    static int cnt=0;
    Counter(){
        cnt++;
        System.out.println("count="+cnt);
    }

}

public class StaticVariableDemo {
    public static void main(String args[]){
        Counter c1=new Counter();
       
        Counter c2=new Counter();
        
        Counter c3=new Counter();
        
    }
}
