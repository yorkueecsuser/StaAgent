import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    // Buggy Foo method with unreachable if-else statement mutant
    public void buggyFoo() {
        // code that doesn't need mutual exclusion
        boolean shouldRun = getCondition();
        if (shouldRun) {
            synchronized(this) {
                // code that requires mutual exclusion
                System.out.println("Inside synchronized block");
            }
        } else {
            // unreachable mutant code
            System.out.println("This code is unreachable");
        }
        // more code that doesn't need mutual exclusion
    }

    // Method to simulate dynamic condition
    private boolean getCondition() {
        return false; // Always false to make the if block unreachable
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