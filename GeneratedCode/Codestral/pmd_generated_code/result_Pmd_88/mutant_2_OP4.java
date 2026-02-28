import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private Set<String> sharedData = new HashSet<>();
    private Lock instanceLock = new ReentrantLock();

    synchronized void buggyMethod() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable block
            int x = 10 / 0; // This will cause an ArithmeticException if the unreachable block is executed
        } else {
            if (!sharedData.contains("bar")) {
                sharedData.add("bar");
            }
        }
    }

    // Remaining code...
}