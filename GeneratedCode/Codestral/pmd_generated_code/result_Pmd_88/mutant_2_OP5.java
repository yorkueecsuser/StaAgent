import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    private Set<String> sharedData = new HashSet<>();
    private Lock instanceLock = new ReentrantLock();

    // Adding an unreachable switch statement
    synchronized void buggyMethod() {
        int unreachableValue = getUnreachableValue(); // This method always returns a value that is not 1
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should be unreachable");
                break;
        }
        if (!sharedData.contains("bar")) {
            sharedData.add("bar");
        }
    }

    private int getUnreachableValue() {
        return 2; // This value is not 1, making the switch statement unreachable
    }

    // Rest of the code...
}