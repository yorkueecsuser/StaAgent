import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private Set<String> sharedData = new HashSet<>();
    private Lock instanceLock = new ReentrantLock();

    // Original code as provided
    synchronized void buggyMethod() {
        if (!sharedData.contains("bar")) {
            sharedData.add("bar");
        }
    }

    void correctMethod() {
        try {
            instanceLock.lock();
            if (!sharedData.contains("bar")) {
                // Mutated Code: Unreachable Switch Statement
                int value = 0;
                switch(value) {
                    case 1: // This case will never be reached
                        sharedData.add("unreachable");
                        break;
                }
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