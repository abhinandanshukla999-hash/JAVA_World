import java.util.Scanner;

public class BankManagement {

    Scanner sc = new Scanner(System.in);

    void atmManagement() {
        String name, ifsc, address;
        long id;
        short num;
        int des;
        int witd;
        long amount = 1000;

        System.out.println("Enter account_holder name:");
        name = sc.nextLine();
        System.out.println("Enter your Bank Account Number:");
        id = sc.nextLong();
        System.out.println("Enter IFSC Code:");
        ifsc = sc.next();
        System.out.println("Enter your address:");
        address = sc.nextLine();
        System.out.println("Choose 1 if you want to deposit else 0:");
        num = sc.nextShort();

        if (num == 1) {
            System.out.println("Enter the amount you want to deposit:");
            des = sc.nextInt();
            amount = amount + des;
            System.out.println("Your current balance is:" + amount);

        } else {
            System.out.println("Enter the amount you want to withdraw:");
            witd = sc.nextInt();

            if (amount > witd) {
                System.out.println("You don't have balance...");
            } else {
                amount = amount - witd;
                System.out.println("Your current balance is:" + amount);
            }
        }

    }

    void pinChange() {
        short pin = 1234;
        System.out.println("Enter your old pin:");
        short old = sc.nextShort();
        if (pin == old) {
            System.out.println("Enter the new pin:");
             pin = sc.nextShort();
             System.out.println("Congratulations PIN changed successfully...");

        }
        else{
            System.out.println("Invalid PIN...");
        }

    }

    public static void main(String[] args) {
        BankManagement obj = new BankManagement();
        Scanner sc=new Scanner(System.in);
        short choose;
        System.out.println("Enter 1 if you want to access your account else 0:");
        choose=sc.nextShort();
        if(choose==1){
            obj.atmManagement();
        }
        else{
            obj.pinChange();
        }
        
    }
}