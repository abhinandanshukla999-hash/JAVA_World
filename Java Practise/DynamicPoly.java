class Ab{
    public void show(){
        System.out.println("In show Ab");
    }
}
class Ba extends Ab{
    public void show(){
        System.out.println("In show ba");
    }
}
public class DynamicPoly {
    public static void main(String[] args) {
        Ab obj=new Ab();
        obj.show();
        obj=new Ba();
        obj.show();
    }
    
}
