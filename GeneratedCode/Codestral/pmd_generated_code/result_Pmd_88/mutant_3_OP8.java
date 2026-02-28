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

    // Mutant code
    void mutatedMethod() {
        try {
            Lock dataLock = instanceLock; // Renamed instanceLock to dataLock
            dataLock.lock();
            if (!sharedData.contains("bar")) {
                sharedData.add("bar");
            }
        } finally {
            dataLock.unlock(); // Using the renamed variable dataLock
        }
    }

    public boolean showBug() {
        buggyMethod();
        mutatedMethod(); // Calling the mutated method
        return sharedData.contains("bar");
    }
}