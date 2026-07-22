import java.util.Scanner;
class IE{
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        String x;
        int y;
        System.out.print("Enter your name: ");
        x=a.nextLine();
        System.out.print("Enter your age: ");
        y=a.nextInt();
        if(y<18){
            System.out.println("HI " +x );
            System.out.println("YOU ARE NOT ALLOWED TO VOTE");

        }
        else{
            System.out.println("CONGRATULATIONS " +x);
            System.out.println("YOU CAN VOTE NOW");
        }

        System.out.println("Your name is: "+x);
        System.out.println("Your ID name is: "+(y+99));
        a.close();
    }
}