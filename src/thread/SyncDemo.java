package thread;

public class SyncDemo {
    public static void main(String[] args) {
        new SyncDemo().go();
    }

    int i=1;
    public int getNumber() {
        synchronized (this) {
            if(i==100) {
                throw new RuntimeException("Over");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
            return i++;
        }
    }
    class AThread extends Thread{
        public void run() {
            while(true) {
                System.out.println("A:"+getNumber());
            }
        }
    }
    class BThread extends Thread{
        public void run() {
            while(true) {
                System.out.println("B:"+getNumber());
            }
        }
    }
    public void go() {
        Thread t1 = new AThread();
        Thread t2 = new BThread();
        t1.start();
        t2.start();
    }

}
