import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AvoidSynchronizedAtMethodLevel {

    private String sharedData = "";
    Lock myLock1 = new ReentrantLock();
    private static Lock myLock2 = new ReentrantLock();

    synchronized void foo() {
        // code, that doesn't need synchronization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //...
        // BUG: AvoidSynchronizedAtMethodLevel
        if (!sharedData.contains("bar")) {
            sharedData += "bar";
        }
        // more code, that doesn't need synchronization
        //...
    }

    void bar() {
        // code, that doesn't need synchronization
        //...
        try {
            myLock1.lock();
            if (!sharedData.contains("bar")) {
                sharedData += "bar";
            }
        } finally {
            myLock1.unlock();
        }
        // more code, that doesn't need synchronization
        //...
    }

    static synchronized void fooStatic() {
        //...
    }

    static void barStatic() {
        // code, that doesn't need synchronization
        //...
        try {
            myLock2.lock();
            // code, that requires synchronization
        } finally {
            myLock2.unlock();
        }
        // more code, that doesn't need synchronization
        //...
    }

    public String showBug() {
        new Thread(this::foo).start();
        new Thread(this::bar).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sharedData;
    }
}