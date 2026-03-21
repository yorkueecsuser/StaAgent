import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AvoidSynchronizedAtMethodLevel {

    private String sharedData = "";
    Lock instanceLock = new ReentrantLock();
    private static Lock CLASS_LOCK = new ReentrantLock();

    synchronized void foo() {
        // code, that doesn't need synchronization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //...
        // BUG: AvoidSynchronizedAtMethodLevel
        int altlnohh = 0;switch  (altlnohh) {case 1:float sknlmoyy = 939322611;break;default:int wlsrgbod = 938331425;break;}
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

    static synchronized void fooStatic() {
        //...
    }

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