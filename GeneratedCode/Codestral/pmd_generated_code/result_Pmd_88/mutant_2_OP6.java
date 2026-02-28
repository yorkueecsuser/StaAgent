import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private Set<String> sharedData = new HashSet<>();
    private Lock instanceLock = new ReentrantLock();

    synchronized void buggyMethod() {
        boolean conditionFor = getCondition();
        // Mutant: Unreachable for loop
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
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

    private boolean getCondition() {
        return false;
    }
}