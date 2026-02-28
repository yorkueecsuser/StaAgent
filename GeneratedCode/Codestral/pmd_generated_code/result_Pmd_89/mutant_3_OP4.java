import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    // BUG: AvoidSynchronizedStatement
    public void buggyFoo() {
        // code that doesn't need mutual exclusion
        boolean condition = getUnreachableCondition();
        synchronized(this) {
            // code that requires mutual exclusion
            System.out.println("Inside synchronized block");
            if (condition) {
                // unreachable code
                System.out.println("This line is unreachable");
            }
        }
        // more code that doesn't need mutual exclusion
    }

    Lock instanceLock = new ReentrantLock();

    public void correctFoo() {
        // code that doesn't need mutual exclusion
        try {
            instanceLock.lock();
            // code that requires mutual exclusion
            System.out.println("Inside locked block");
            boolean condition = getUnreachableCondition();
            if (condition) {
                // unreachable code
                System.out.println("This line is unreachable");
            }
        } finally {
            instanceLock.unlock();
        }
        // more code that doesn't need mutual exclusion
    }

    public void showBug() {
        buggyFoo();
    }

    private boolean getUnreachableCondition() {
        return false; // always false to make the condition unreachable
    }
}