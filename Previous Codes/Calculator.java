import java.util.Scanner;
 public class Calculator{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter first number: ");    
        float a=s.nextInt();
        
        System.out.println("Enter second number: ");   
        float b=s.nextInt();

        System.out.println("Enter the character :");
        char c=s.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println("Sum is : "+(a+b));
                
                break;
            case '-':
                System.out.println("Subtract is: " +(a-b));
                break;
            case '*':
                System.out.println("Multiply is: "+(a*b));  
                break;
            case '/' :
                try {
                    float x=a/b;
                    System.out.println("Division is:"+x);
                } catch (ArithmeticException e) {
                      System.out.println("Can't divide by 0 enter a valid number!!!\n "+e);
                }
                
                break;
            default:
                System.out.println("Enter a valid character !!!");
                break;
        }
        s.close();
    }

}
