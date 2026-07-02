import java.util.Scanner;

public class Java{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        System.out.print("Enter a float: ");
        float b = sc.nextFloat();

        System.out.print("Enter a string: ");
        String name = sc.next();

        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Name: " + name);
    }
}
