class Inheritable implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello ! @Abhinandan");
        }
        try{
            Thread.sleep(50000);
        }
        catch(InterruptedException e){

            System.out.println("Interrupted"+e);
        }

    }
}

class Next implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
        System.out.println("Hi, What can I do?");
        }
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){

            System.out.println("Interrupted"+e);
        }

    }
}

class Main {
    public static void main(String[] args) {

        Inheritable obj1 = new Inheritable();
        Next obj2 = new Next();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.setPriority(10);
        

        t1.start();
        t2.start();
    }
}