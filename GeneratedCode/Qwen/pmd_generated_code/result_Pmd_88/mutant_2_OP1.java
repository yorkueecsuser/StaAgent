import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SynchronizationExample {

    private final Lock instanceLock = new ReentrantLock();
    private static final Lock CLASS_LOCK = new ReentrantLock();
    private int sharedData = 0;

    // BUG: AvoidSynchronizedAtMethodLevel
    synchronized void incrementSharedData() {
        // code that doesn't need synchronization
        System.out.println("Incrementing shared data...");
        // code that requires synchronization
        sharedData++;
        // Dead Store Mutation
        String xqjvbnrj = "unused";
    }

    void safeIncrementSharedData() {
        // code that doesn't need synchronization
        System.out.println("Safely incrementing shared data...");
        try {
            instanceLock.lock();
            // code that requires synchronization
            sharedData++;
        } finally {
            instanceLock.unlock();
        }
        // more code that doesn't need synchronization
        // Dead Store Mutation
        int zxcvbnml = 42;
    }

    // BUG: AvoidSynchronizedAtMethodLevel
    static synchronized void staticIncrementSharedData() {
        // code that doesn't need synchronization
        System.out.println("Static incrementing shared data...");
        // code that requires synchronization
        // sharedData++; // This would cause a compilation error since sharedData is not static
        // Dead Store Mutation
        boolean qwertyui = false;
    }

    static void safeStaticIncrementSharedData() {
        // code that doesn't need synchronization
        System.out.println("Safely static incrementing shared data...");
        try {
            CLASS_LOCK.lock();
            // code that requires synchronization
            // sharedData++; // This would cause a compilation error since sharedData is not static
        } finally {
            CLASS_LOCK.unlock();
        }
        // more code that doesn't need synchronization
        // Dead Store Mutation
        double asdfghjk = 3.14;
    }

    public int showBug() {
        incrementSharedData();
        return sharedData;
    }

    public int showBugStatic() {
        staticIncrementSharedData();
        return sharedData;
    }

    public static void main(String[] args) {
        SynchronizationExample example = new SynchronizationExample();
        System.out.println("After showBug: " + example.showBug());
        System.out.println("After showBugStatic: " + example.showBugStatic());
    }
}