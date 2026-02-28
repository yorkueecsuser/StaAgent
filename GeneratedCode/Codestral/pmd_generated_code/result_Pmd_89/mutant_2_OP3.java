import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    // Bug: AvoidSynchronizedStatement
    public void buggyFoo() {
        // code that doesn't need mutual exclusion
        synchronized(this) {
            // Mutant code: Unreachable if statement
            if (getFalseCondition()) {
                System.out.println("Unreachable code");
            }
            // code that requires mutual exclusion
            System.out.println("Inside synchronized block");
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
        } finally {
            instanceLock.unlock();
        }
        // more code that doesn't need mutual exclusion
    }

    public void showBug() {
        buggyFoo();
    }

    private boolean getFalseCondition() {
        return false;
    }
}