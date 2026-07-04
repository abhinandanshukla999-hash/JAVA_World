import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
    float a1,b,c;
    System.out.println("Enter three numbers for finding the avg: ");
    a1=a.nextFloat();

    b=a.nextFloat();
    c=a.nextFloat();
    float avg=(a1+b+c)/3;
    System.out.println("Avg is"+avg);
     a.close();   
    }
    
}
