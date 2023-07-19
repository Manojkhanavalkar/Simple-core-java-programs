class Rectagle{
    int length;
    int width;
    void accept(int l,int w){
        length=l;
        width=w;
    }
    void findArea(){
        System.out.println("Area of rectangle="+(length*width));
    }
}
public class FindAreaOfRec {
    public static void main(String args[]){
        Rectagle r1=new Rectagle();
        r1.accept(20, 5);
        r1.findArea();
    }
}
