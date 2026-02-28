import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private Set<String> sharedDataA = new HashSet<>();
    private Lock instanceLockB = new ReentrantLock();

    synchronized void buggyMethod() {
        if (!sharedDataA.contains("bar")) {
            sharedDataA.add("bar");
        }
    }

    void correctMethod() {
        try {
            instanceLockB.lock();
            if (!sharedDataA.contains("bar")) {
                sharedDataA.add("bar");
            }
        } finally {
            instanceLockB.unlock();
        }
    }

    public boolean showBug() {
        buggyMethod();
        return sharedDataA.contains("bar");
    }
}