import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private Set<String> sharedData = new HashSet<>();
    private Lock instanceLock = new ReentrantLock();

    synchronized void buggyMethod() {
        if (!sharedData.contains("bar")) {
            sharedData.add("bar");
        }

        // Mutant code: Unreachable if statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is unreachable as the condition is always false
            System.out.println("This is an unreachable branch.");
        }
    }

    // getCondition() is a placeholder for a method that returns a condition
    // In a real-world scenario, this method would provide the condition dynamically
    private boolean getCondition() {
        return false;
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