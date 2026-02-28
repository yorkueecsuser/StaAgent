import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AvoidSynchronizedAtMethodLevel {

    private String sharedData = "";
    Lock instanceLock = new ReentrantLock();
    private static Lock CLASS_LOCK = new ReentrantLock();

    /**
     * Dead Store Mutant: Unused variable declaration
     */
    private String unusedString1 = "unused";

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

    /**
     * Dead Store Mutant: Unused variable declaration
     */
    private String unusedString2 = "unused";

    void bar() {
        // code, that doesn't need synchronization
        //...
        try {
            instanceLock.lock();
            if (!sharedData.contains("bar")) {
                sharedData += "bar";
            }
        } finally {
            instanceLock.unlock();
        }
        // more code, that doesn't need synchronization
        //...
    }

    /**
     * Dead Store Mutant: Unused variable declaration
     */
    private String unusedString3 = "unused";

    static synchronized void fooStatic() {
        //...
    }

    /**
     * Dead Store Mutant: Unused variable declaration
     */
    private String unusedString4 = "unused";

    static void barStatic() {
        // code, that doesn't need synchronization
        //...
        try {
            CLASS_LOCK.lock();
            // code, that requires synchronization
        } finally {
            CLASS_LOCK.unlock();
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