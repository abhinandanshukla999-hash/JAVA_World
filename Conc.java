class A{
    void concatinate(String a,String b){
        String c=a+b;
        System.out.println(c);
    }
}
 public class Conc{
    public static void main(String[] args) {
        A obj=new A();
        obj.concatinate("Abhinandan ", "Shukla");
    }
}