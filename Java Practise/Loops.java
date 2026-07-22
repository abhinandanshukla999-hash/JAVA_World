import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the number :");
        int n=s.nextInt();
        
        for(int i=0; i<=n;i++)
         {
               System.out.println(+i+".Hello World!"); 
        }
        int i=0;
        while(i<=1000){
            System.out.println("In the while loop");
            i++;
        }
        do{
            System.out.println("In the do while");
        }
        while(i<10);
        s.close();

    }
}
