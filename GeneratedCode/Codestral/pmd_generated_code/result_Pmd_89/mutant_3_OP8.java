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
    Lock renamedLock = instanceLock; // New variable renamedLock

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

    // Mutant code based on Renaming Mutation Operator
    public void mutantFoo() {
        // code that doesn't need mutual exclusion
        synchronized(this) {
            // Renaming the instanceLock variable to renamedLock within the synchronized block
            try {
                renamedLock.lock();
                // code that requires mutual exclusion
                System.out.println("Inside renamedLocked synchronized block");
            } finally {
                renamedLock.unlock();
            }
        }
        // more code that doesn't need mutual exclusion
    }
}