import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AvoidSynchronizedAtMethodLevel {

    private String renamedData = "";
    Lock renamedLock = new ReentrantLock();
    private static Lock renamedClassLock = new ReentrantLock();

    synchronized void foo() {
        // code, that doesn't need synchronization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //...
        // BUG: AvoidSynchronizedAtMethodLevel
        if (!renamedData.contains("bar")) {
            renamedData += "bar";
        }
        // more code, that doesn't need synchronization
        //...
    }

    void bar() {
        // code, that doesn't need synchronization
        //...
        try {
            renamedLock.lock();
            if (!renamedData.contains("bar")) {
                renamedData += "bar";
            }
        } finally {
            renamedLock.unlock();
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
            renamedClassLock.lock();
            // code, that requires synchronization
        } finally {
            renamedClassLock.unlock();
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
        return renamedData;
    }
}