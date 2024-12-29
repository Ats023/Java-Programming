//Creating a thread by extending thread class;
class NewThread extends Thread {
    NewThread(String threadName) {
        super(threadName); //create thread
    }
    public void run() { //must override run
        try {
            for(int i=0; i<10; i++) {
                System.out.println(this.getName()+": "+i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(this.getName()+" Interrupted.");
        }
        System.out.println(this.getName()+" is Finished.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Thread ct = Thread.currentThread();
        ct.setName("Main thread");
        NewThread nt = new NewThread("Child Thread");
        nt.start();
        try {
            for(int i=0; i<10; i++) {
                System.out.println(ct.getName()+": "+i);
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(ct.getName()+" Interrupted.");
        }
        System.out.println(ct.getName()+" is Finished.");
    }
    }
    
