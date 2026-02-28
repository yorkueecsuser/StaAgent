import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private Set<String> sharedData = new HashSet<>();
    private Lock instanceLock = new ReentrantLock();

    synchronized void buggyMethod() {
        boolean unreachableCondition = getUnreachableCondition();
        if (!sharedData.contains("bar")) {
            if (unreachableCondition) {    // Inserted unreachable if statement
                throw new RuntimeException("This code should never be executed");
            }
            sharedData.add("bar");
        }
    }

    void correctMethod() {
        try {
            instanceLock.lock();
            boolean unreachableCondition = getUnreachableCondition();
            if (!sharedData.contains("bar")) {
                if (unreachableCondition) {    // Inserted unreachable if statement
                    throw new RuntimeException("This code should never be executed");
                }
                sharedData.add("bar");
            }
        } finally {
            instanceLock.unlock();
        }
    }

    private boolean getUnreachableCondition() {
        return false;   // The condition is always false to make it unreachable
    }

    public boolean showBug() {
        buggyMethod();
        return sharedData.contains("bar");
    }
}