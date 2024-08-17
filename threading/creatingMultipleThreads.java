package threading;


public class creatingMultipleThreads {

    public static void main(String[] args) {

        for( int i = 0; i<3; i++ ){

            String threadName = "thread"+i;
            printNumbers pn = new printNumbers(threadName);
            //pn.t.start();
            
            pn.start();
            // try {
            //     pn.t.join();    //using .join() we can make sure that our main thread is kept alive till the thread on which it is called is finished/exited.
            // } catch (InterruptedException e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            // }
        }
        // Thread t = new Thread();
        // try {
        //     t.join();
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        // try {
        //     Thread.currentThread().join();
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }


        System.out.println(Thread.currentThread().getName()+" exited !"); // if we remove the .join() implementation above, this will get executed as soon as the for loop is taken care of.
    }
    
}

class printNumbers implements Runnable{
    Thread t;

    public printNumbers(String threadName){
        t = new Thread(this, threadName);
        // try {
        //     t.join();
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
    }

    public void start(){
        this.t.start();
    }

    @Override
    public void run(){
        
        for( int i = 0; i<5; i++){
            System.out.println(" thread : "+ Thread.currentThread().getName() + " "+ i + " ");
            try {
                Thread.currentThread().sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }

    
}
