import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AvoidSynchronizedAtMethodLevel {

    private String sharedData = "";
    Lock instanceLock = new ReentrantLock();
    private static Lock CLASS_LOCK = new ReentrantLock();

    synchronized void foo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!sharedData.contains("bar")) {
            sharedData += "bar";
        }
    }

    void bar() {
        try {
            instanceLock.lock();
            if (!sharedData.contains("bar")) {
                sharedData += "bar";
            }
        } finally {
            instanceLock.unlock();
        }
    }

    static synchronized void fooStatic() {
        //...
    }

    static void barStatic() {
        try {
            CLASS_LOCK.lock();
            // code, that requires synchronization
        } finally {
            CLASS_LOCK.unlock();
        }
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