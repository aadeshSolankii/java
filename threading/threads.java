package threading;

public class threads {

    public static void main(String[] args) {

        var ct = Thread.currentThread();
        System.out.println("name of current thread : "+ct.getName());

        var c = new t2();
        
        c.t1.start();

        for(int i = 0; i<10; i++){

            System.out.println("name of current thread : "+ct.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


        
    }
    
}


class t2 implements Runnable{

    Thread t1 = new Thread(this, "t001");

    public void run(){
        var currThread = Thread.currentThread();

        System.out.println("name of current thread : "+currThread.getName());

        for(int i = 0; i<10; i++){
            System.out.println("name of current thread : "+currThread.getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
    
}