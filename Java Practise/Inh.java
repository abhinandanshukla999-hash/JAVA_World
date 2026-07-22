class Axh{
    int age;
    String name;
     void setValues(int age,String name)
    {
        this.name=name;
        this.age=age;
        System.out.println("In class A");
    }
    
}
class Bass extends Axh{
     void display(){
        System.out.println("Name: "+name +"\nAge : "+age);
    }
}
public class Inh extends Bass {
    public static void main(String []args){
       Inh  obj=new Inh();
        obj.display();
        obj.setValues(23,"Name");
        obj.display();

    }

}

