import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private Set<String> sharedData = new HashSet<>();
    private Lock instanceLock = new ReentrantLock();

    synchronized void buggyMethod() {
        int i = 0;
        while (i < 10) {
            if (!sharedData.contains("bar" + i)) {
                sharedData.add("bar" + i);
            }
            i++;
        }
    }

    // Other methods...
}