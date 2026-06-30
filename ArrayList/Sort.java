
import java.util.Scanner;
import java.util.ArrayList;

public class Sort {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the ArrayList: ");
        int len=sc.nextInt();
        for(int i=0;i<=len-1;i++)
        {
            System.out.println("Enter value");
            arr.add(sc.nextInt());
        }
        System.out.println("Your provided list: ");
        for(int data:arr){
            System.out.print(data+" ");
        }
        for(int i=0;i<=arr.size()-1;i++)
        {
            for(int j=0;j<=arr.size()-2;j++)
            {
                if(arr.get(i)<arr.get(j))
                {
                    int temp=arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                }
            }
        }
        System.out.println("\nFinal ArrayList: ");
        for(int data:arr){
            System.out.print(data+" ");
        }
         
        sc.close();
    }
}