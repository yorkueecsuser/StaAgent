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

    Lock l = new ReentrantLock();  // Mutant: Renamed 'instanceLock' to 'l'

    public void correctFoo() {
        // code that doesn't need mutual exclusion
        try {
            l.lock();  // Mutant: Using the renamed lock variable 'l'
            // code that requires mutual exclusion
            System.out.println("Inside locked block");
        } finally {
            l.unlock();  // Mutant: Using the renamed lock variable 'l'
        }
        // more code that doesn't need mutual exclusion
    }

    public void showBug() {
        buggyFoo();
    }
}