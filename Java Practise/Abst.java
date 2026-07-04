import java.util.Scanner;
abstract class A{
    int a,b;
    public abstract void  sum(int a, int b);
    public void display(){
        System.out.println("Method is being ready for execution :");
    }

}
    class B extends A{
    public  void sum(int a,int b){
        this.a=a;
        this.b=b;
        int c=a+b;
        System.out.print("Sum is :"+c);
    }    
}


class Abst {
    public static void main(String[] args) {
        B obj =new B();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x=s.nextInt();
        int y=s.nextInt();
        obj.display();
        obj.sum(x,y);
        
        s.close();
        
    }
}
