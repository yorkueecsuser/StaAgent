import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    // BUG: AvoidSynchronizedStatement
    public void buggyFoo() {
        // code that doesn't need mutual exclusion
        synchronized(this) {
            // code that requires mutual exclusion
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    // unreachable code
                    System.out.println("This is an unreachable switch case");
                    break;
            }
            System.out.println("Inside synchronized block");
        }
        // more code that doesn't need mutual exclusion
    }

    // Method to provide an unreachable value for the switch statement
    private int getUnreachableValue() {
        return -1; // Always returns a value outside the range of case values
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