import java.util.Scanner;
public class Constructor {
    int age;
    String name;
    Constructor(int age,String name)
    {
     this.age=age;
     this.name=name;
    }
    void setdata(int age,String name){
        this.name=name;
        this.age=2026-age;
    }
    void display(){
      System.out.println("Name :"+name+"\nAge :"+age);
    }

public static void main(String args[])
{
    Scanner s =new Scanner(System.in);
    Constructor obj=new Constructor(19,"Abhinandan Shukla");
    System.out.println("This is your default output::");
    obj.display();
    System.out.println("Enter your name : ");
    String a=s.nextLine();
    System.out.println("Enter your birth year : ");
    int b=s.nextInt();
    obj.setdata(b, a);
    obj.display();
    s.close();
}
}
