import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AvoidSynchronizedAtMethodLevel {

    private String sharedData = "";
    Lock instanceLock = new ReentrantLock();
    private static Lock CLASS_LOCK = new ReentrantLock();

    synchronized void foo() {
        // original code
        //...
        if (!sharedData.contains("bar")) {
            sharedData += "bar";
        }
        //...

        // Mutation 1: Duplicating the assignment statement
        if (!sharedData.contains("bar")) {
            sharedData += "bar";
        }
        if (!sharedData.contains("bar")) {
            sharedData += "bar";
        }
        //...
    }

    void bar() {
        // original code
        //...
        try {
            instanceLock.lock();
            if (!sharedData.contains("bar")) {
                sharedData += "bar";
            }
        } finally {
            instanceLock.unlock();
        }
        //...

        // Mutation 2: Duplicating the assignment statement
        try {
            instanceLock.lock();
            if (!sharedData.contains("bar")) {
                sharedData += "bar";
            }
            if (!sharedData.contains("bar")) {
                sharedData += "bar";
            }
        } finally {
            instanceLock.unlock();
        }
        //...
    }

    static synchronized void fooStatic() {
        // original code
        //...
    }

    static void barStatic() {
        // original code
        //...
        try {
            CLASS_LOCK.lock();
            // code, that requires synchronization
        } finally {
            CLASS_LOCK.unlock();
        }
        //...

        // Mutation 3: Duplicating the lock and unlock statements
        try {
            CLASS_LOCK.lock();
        } finally {
            CLASS_LOCK.unlock();
        }
        try {
            CLASS_LOCK.lock();
        } finally {
            CLASS_LOCK.unlock();
        }
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