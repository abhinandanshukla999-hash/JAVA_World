public class Abc {
    String num;
    String name;
    String sum(String n){
        num=n;
        return num;
    }
    public static void main (String args[]){
        Abc obj =new Abc();
        String n=obj.sum("ABHINANDAN SHUKLA");
        System.out.println("Given String is : " +n);
    }
}
