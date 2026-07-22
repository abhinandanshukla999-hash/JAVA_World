import java.util.Scanner;
class Threwable 
 {
    void Div( int a,int b) 
    {
       
        int c=a/b;
        System.out.println("Division is: "+c);
        System.out.println("Hello Brother!!!");
    }

 }
 

public class JavaThrows {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        Threwable obj=new Threwable();
       
        try {
            obj.Div(a,b);
        } catch (ArithmeticException e){
            System.out.println("Can't divide"+e);
        }
       System.out.println("Enter the length of the array :");
       int l=s.nextInt();

       int[] arr = new int[l];
       System.out.println("Enter the elements :");

        for(int i = 0; i < l; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Elements are:");
       for(int i = 0; i < l; i++){
           System.out.print(+arr[i]+" ");
        }
        
    }
    
}
