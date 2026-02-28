import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private Set<String> sharedData = new HashSet<>();
    private Lock instanceLock = new ReentrantLock();

    synchronized void buggyMethod() {
        int deadStoreVariable; // Dead Store: Added an unused variable declaration
        if (!sharedData.contains("bar")) {
            sharedData.add("bar");
        }
    }

    void correctMethod() {
        int deadStoreVariable; // Dead Store: Added an unused variable declaration
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