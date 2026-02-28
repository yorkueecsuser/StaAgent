import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private Set<String> sharedData = new HashSet<>();
    private Set<String> a = sharedData; // Mutant code
    private Lock instanceLock = new ReentrantLock();

    synchronized void buggyMethod() {
        if (!sharedData.contains("bar")) {
            sharedData.add("bar");
        }
    }

    void correctMethod() {
        try {
            instanceLock.lock();
            if (!a.contains("bar")) { // Mutant code
                a.add("bar"); // Mutant code
            }
        } finally {
            instanceLock.unlock();
        }
    }

    public boolean showBug() {
        buggyMethod();
        return a.contains("bar"); // Mutant code
    }
}