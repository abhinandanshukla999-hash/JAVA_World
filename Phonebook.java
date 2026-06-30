import java.util.HashMap;
import java.util.Scanner;
class Phonebook{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       HashMap<String,Integer> hm= new HashMap<>();
       hm.put("Hello", 2345);
        hm.put("Halo", 2545); 
        hm.put("My ", 2335);
        for(String data:hm.keySet()){
            System.out.println(data+":"+hm.get(data));
        }
        System.out.println("Enter the key you want to search for:");
        String a=sc.next();
        for(String data1:hm.keySet()){
            if(data1.equals(a)){
                System.out.println("Found the key:"+hm.get(data1));
            }
             
        }
        

    


    }
}