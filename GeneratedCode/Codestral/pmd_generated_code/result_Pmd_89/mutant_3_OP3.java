import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    // BUG: AvoidSynchronizedStatement
    public void buggyFoo() {
        // code that doesn't need mutual exclusion
        if (getCondition()) { // Unreachable if statement
            // This block is unreachable
            System.out.println("This block is unreachable");
        }
        synchronized(this) {
            // code that requires mutual exclusion
            System.out.println("Inside synchronized block");
        }
        // more code that doesn't need mutual exclusion
    }

    // Method to dynamically determine the condition for the unreachable if statement
    private boolean getCondition() {
        return false;
    }

    Lock instanceLock = new ReentrantLock();

    public void correctFoo() {
        // code that doesn't need mutual exclusion
        try {
            instanceLock.lock();
            // code that requires mutual exclusion
            System.out.println("Inside locked block");
        } finally {
            instanceLock.unlock();
        }
        // more code that doesn't need mutual exclusion
    }

    public void showBug() {
        buggyFoo();
    }
}