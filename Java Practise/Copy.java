import java.util.Scanner;
public class Copy {
    int age;
    String name;
    public void display(){
        System.out.println("Name : "+name +"\nAge: "+age);
    }
    Copy(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void Setnam(int age,String name){
        this.age=age;
        this.name=name;
    }
    Copy(Copy obj) {
        this.age=obj.age;
        this.name=obj.name;
    }
    public static void main(String []args)
    {
        Scanner s=new Scanner (System.in);
        Copy obj1=new Copy(18,"Abhinandan");
        Copy obj2=new Copy(obj1);
        
        Copy obj3=new Copy(obj2);
        obj3.display();
        System.out.println("Enter the age : ");
        int ae=s.nextInt();
        System.out.println("Enter your name :");
        String nme=s.next();
        obj1.Setnam(ae, nme);
        obj1.display();
        s.close();
        obj2.display();



    }
}
