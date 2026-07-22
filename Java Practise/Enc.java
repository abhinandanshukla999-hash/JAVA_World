public class Enc {
    private int age;
    String name;
    public void setname(int age,String name){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name :"+name +"\nAge :" +age);
    }
    public static void main(String[] args) {
        Enc obj =new Enc();
        obj.setname(90, "Willimson");
        for(int i=0; i<31;i++){
             obj.display();
        }

       
    
    }
}