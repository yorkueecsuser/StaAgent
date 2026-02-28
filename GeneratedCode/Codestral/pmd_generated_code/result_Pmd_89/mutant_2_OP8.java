import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    // BUG: AvoidSynchronizedStatement
    public void buggyFoo() {
        // code that doesn't need mutual exclusion
        synchronized(this) {
            // code that requires mutual exclusion
            System.out.println("Inside synchronized block");
        }
        // more code that doesn't need mutual exclusion
    }

    Lock instanceLock = new ReentrantLock();
    Lock r = instanceLock; // Mutant code

    public void correctFoo() {
        // code that doesn't need mutual exclusion
        try {
            r.lock(); // Mutant code
            // code that requires mutual exclusion
            System.out.println("Inside locked block");
        } finally {
            r.unlock(); // Mutant code
        }
        // more code that doesn't need mutual exclusion
    }

    public void showBug() {
        buggyFoo();
    }
}