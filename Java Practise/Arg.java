import java.util.Scanner;
public class Arg {
    int a,b;
    public void sum(){
        int c=a+b;
        System.out.println("Sum is: "+c);
    }    
    public void pro(){
        int c=a*b;
        System.out.println("Product is: "+c +" of inputs " +a +" and "+b);
    }
    public int avg(){
        int c=(a+b)/2;
        return c;
    }
    public static void main(String[] args){
        int x,y,m,n, z,z1;
        Arg obj1 =new Arg();
        Arg obj2=new Arg();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        x=s.nextInt();
        y=s.nextInt();
        obj1.a=x;
        obj1.b=y;
        obj1.sum();
        obj1.pro(); 
        z=obj1.avg();
        System.out.println("Average of two number is: "+z);
        System.out.println("Enter another two numbers: ");
        m=s.nextInt();
        n=s.nextInt();
        obj2.a=m;
        obj2.b=n;
        obj2.sum();
        obj2.pro();
        z1=obj2.avg();
        System.out.println("Average of the given two numbers is :"+z1);
        s.close();




    }
}
