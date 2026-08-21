import java.util.Scanner;
@FunctionalInterface
interface ABC{
    public void Factorial(int n);
}
public class Fact{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int a=s.nextInt();
        ABC obj=(int n)->{
            int i,f=1;
            for(i=1;i<=n;i++){
                f=f*i;

            }
            System.out.println("Factorial is :"+f);
        };
        obj.Factorial(a);
         s.close();
    }
   
}