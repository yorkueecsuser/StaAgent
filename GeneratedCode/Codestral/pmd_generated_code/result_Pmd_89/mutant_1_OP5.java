import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Foo {
    // BUG: AvoidSynchronizedStatement
    public void buggyFoo() {
        // code that doesn't need mutual exclusion
        synchronized(this) {
            // code that requires mutual exclusion
            System.out.println("Inside synchronized block");

            // Unreachable Switch Statement Mutant
            int unreachableValue = getUnreachableValue(); // this method should return a value that is not 1
            switch (unreachableValue) {
                case 1:
                    System.out.println("This code will not be reached");
                    break;
            }
        }
        // more code that doesn't need mutual exclusion
    }

    // Method to get an unreachable value
    private int getUnreachableValue() {
        return 2; // return a value that is not 1
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