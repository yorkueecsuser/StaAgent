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
        
        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable if statement.");
        }
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
        
        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is another unreachable if statement.");
        }
    }

    // BUG: AvoidSynchronizedAtMethodLevel
    static synchronized void staticIncrementSharedData() {
        // code that doesn't need synchronization
        System.out.println("Static incrementing shared data...");
        // code that requires synchronization
        // sharedData++; // This would cause a compilation error since sharedData is not static
        
        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is a static unreachable if statement.");
        }
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
        
        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is another static unreachable if statement.");
        }
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

    // Method to provide a dynamic condition for the if statements
    private boolean getCondition() {
        return false; // This will always return false, but the compiler cannot determine this at compile time
    }
}