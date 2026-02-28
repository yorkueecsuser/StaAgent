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
        int abcdefgh = 42; // Unused variable declaration
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
        String ijklmnop = "unused"; // Unused variable declaration
    }

    // BUG: AvoidSynchronizedAtMethodLevel
    static synchronized void staticIncrementSharedData() {
        // code that doesn't need synchronization
        System.out.println("Static incrementing shared data...");
        // code that requires synchronization
        // sharedData++; // This would cause a compilation error since sharedData is not static
        // Dead Store Mutation
        double qrstuvwx = 3.14; // Unused variable declaration
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
        boolean yzabcdef = true; // Unused variable declaration
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