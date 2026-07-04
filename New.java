sealed class A permits B{
    public void show(){
        System.out.println("Practicing to implement the logics of the following sealed  and also the non sealed classes.");
    }
}
final class B extends A{
     public void show(){
        System.out.println("In the show B");
    }
}

public class New {
    public static void main(String[] args) {
        A obj=new B();
        obj.show();
        obj=new A();
        obj.show();
        
    }
}
