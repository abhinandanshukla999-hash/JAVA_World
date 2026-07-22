class Base{
    int count;
    public synchronized void Run(){
        
        count++;
        
    }
}

public class SyncExample {
    public static void main(String[] args) {
        Base obj=new Base();
        Thread ab=new Thread(new Runnable() {
           public void run(){
                for(int i=0;i<1000;i++){
                    obj.Run();
                }
                
            }
        });
        ab.run();
        System.out.println(obj.count);
    }
    
}
