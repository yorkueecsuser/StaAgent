import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    // BUG: AvoidSynchronizedStatement
    public void buggyFoo() {
        // code that doesn't need mutual exclusion
        synchronized(this) {
            // code that requires mutual exclusion
            System.out.println("Inside synchronized block");
            // Mutant code: Insert unreachable if-else statement
            if (getFalseCondition()) {
                System.out.println("This is an unreachable block");
            } else {
                System.out.println("This will never be printed");
            }
        }
        // more code that doesn't need mutual exclusion
    }

    private boolean getFalseCondition() {
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