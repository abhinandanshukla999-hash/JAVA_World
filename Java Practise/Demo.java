
import java.util.Scanner;
class Demo {
    public void sum(int a,int b){
        int s=a+b;
        System.out.println("Sum is: " +s);
    }
    public int sum(int a,int b, int c){
        return a+b+c;
    }
    public void sum(float c,float d){ 
        float s=c*d;
        System.out.println("Multiply of programmed number is : " +s);

    }

  public static void main(String [] args){
    int a,b;
    Demo obj=new Demo();
    Scanner x=new Scanner(System.in);
    System.out.println("Enter a number: ");
    a=x.nextInt();
    System.out.println("Enter another number: ");
    b=x.nextInt();
    obj.sum(a,b);

    int num=obj.sum(5,6,7);
    System.out.println("Sum of three programmed number is :" +num);
    obj.sum(56.2f,65.5f);
    x.close();
  }

    
}
 
