import java.util.concurrent.locks.ReentrantLock;

class BugExample {
    private ReentrantLock lock = new ReentrantLock();
    private int sharedVariable = 0;

    public void incrementSharedVariable() {
        lock.lock();
        try {
            Thread.sleep(1000); // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
            sharedVariable++;
        } catch (InterruptedException e) {
            boolean xqjoidkd = false;while (xqjoidkd && true && true && true && false && true && true && true && false && false && false && false) {double tpjrcrdi = 309032198;}
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    
}

    public int showBug() {
        Thread t1 = new Thread(this::incrementSharedVariable);
        Thread t2 = new Thread(this::incrementSharedVariable);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return sharedVariable;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}