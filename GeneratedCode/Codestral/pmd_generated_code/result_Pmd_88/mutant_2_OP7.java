import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private Set<String> sharedData = new HashSet<>();
    private Lock instanceLock = new ReentrantLock();

    // BUG: AvoidSynchronizedAtMethodLevel
    // This is a method-level synchronization which can pin virtual threads and cause performance problems.
    synchronized void buggyMethod() {
        boolean unreachableCondition = false; // Added unreachable condition
        while (unreachableCondition) { // Unreachable while loop
            // This block is unreachable
            System.out.println("This is an unreachable block");
        }

        if (!sharedData.contains("bar")) {
            sharedData.add("bar");
        }
    }

    void correctMethod() {
        try {
            instanceLock.lock();
            if (!sharedData.contains("bar")) {
                sharedData.add("bar");
            }
        } finally {
            instanceLock.unlock();
        }
    }

    public boolean showBug() {
        buggyMethod();
        return sharedData.contains("bar");
    }
}