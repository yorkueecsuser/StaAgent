import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private Set<String> sharedData = new HashSet<>();
    private Lock instanceLock = new ReentrantLock();

    synchronized void buggyMethod() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) { // unreachable branch
            sharedData.remove("bar"); // this line will never be executed
        } else {
            if (!sharedData.contains("bar")) {
                sharedData.add("bar");
            }
        }
    }

    private boolean getUnreachableCondition() {
        return false; // this condition makes the branch unreachable
    }

    // Remainder of the class code...
}