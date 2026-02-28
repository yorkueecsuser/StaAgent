import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private Set<String> sharedData = new HashSet<>();
    private Lock instanceLock = new ReentrantLock();

    synchronized void buggyMethod() {
        boolean mutantCondition = false;
        for (int i = 0; mutantCondition; i++) {
            // This loop is unreachable because mutantCondition is always false
            System.out.println("This line should never be executed.");
        }
        if (!sharedData.contains("bar")) {
            sharedData.add("bar");
        }
    }

    // Other methods remain the same...
}