import java.util.Scanner;
class NewException extends Exception
{
    NewException(){
        System.out.println("Access Denied!");
    }
}
public class Exec  {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter The Password :");
        int n=sc.nextInt(); 
        int k=0;
        while(n!=0){
            k=k+1;
            n=n/10;
        }
        if (k==8) {
            System.out.println("Access granted!!!");
        }
        else{
            try{
                throw new NewException();
            }
            catch(NewException e){
                System.out.println("Error"+e);

            
             
            }
        }
    }
    

}
