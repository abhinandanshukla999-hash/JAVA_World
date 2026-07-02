// class XY extends Throwable{
//     XY(String a){
//         super(a);
//         System.out.println("IN the constructor with super class");
//     }
// }
// public class Exception {
//     public static void main(String[] args) {
//         int a=15,b=15;
//         int c=b/a;
//         if (c==1){
//             try {
//                 throw new XY("In the XY constructor");
//             } catch (XY e) {
//                 System.out.println("Remainder 1 is not applicable\n"+e);
                
//             }
//         }

//     }
    
// }
        // Execution of the MultiThreading
class Apple extends Thread
{
    public void run()
    {
        for (int i=1;i<=100;i++)
        {
            System.out.println(i+". Hi"+" ");
        }
    }
}
class Bat extends Thread
{
    public void run()
    {
       for (int i=1;i<=100;i++)
        {
            System.out.println(i+". Hello"+" ");
        }
    }
}
public class Exception
{
    public static void main(String[] args) {
        Apple obj=new Apple();
        obj.start();

        Bat obje=new Bat();
        obje.start();
        
    }
}

