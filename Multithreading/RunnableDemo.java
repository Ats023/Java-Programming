//Creating a thread by implementing runnable interface
class NewThread implements Runnable { 
    Thread t;
    NewThread(String threadName) {
        t = new Thread(this,threadName);
        t.start();
    }
    public void run() {
        int n=10;
        try {
            for(int i=0; i<n; i++) {
                System.out.println(t.getName()+": "+i);
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) {
            System.out.println(t.getName()+" Interrupted.");
        }
        System.out.println(t.getName()+" is finished.");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread ct = Thread.currentThread(); //returning the current thread which is the main thread
        ct.setName("Main thread"); //so I can set the name or do whatever the fuck I want with this
        NewThread nt = new NewThread("Child Thread"); //this is my actual new thread using NewThread Class
        try {
            for(int i=0; i<10; i++) {
                System.out.println(ct.getName()+": "+i);
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(ct.getName()+" Interrrupted.");
        }
        System.out.println(ct.getName()+" is finished.");
    }
}
