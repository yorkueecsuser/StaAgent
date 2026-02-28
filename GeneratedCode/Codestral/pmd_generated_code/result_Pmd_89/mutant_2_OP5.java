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
        // mutant: unreachable switch statement
        boolean unreachable = false;
        switch (unreachable? 1 : 0) {
            case 1:
                System.out.println("This should never be printed");
                break;
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
}