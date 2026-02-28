import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    }
}

// Mutation Operator: Unreachable for loop
class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }
    }
}

// Mutation Operator: Unreachable if statement
class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }

        // Unreachable if statement
        if (false) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }
    }
}

// Mutation Operator: Unreachable while loop
class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }

        // Unreachable while loop
        while (false) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }
    }
}

// Mutation Operator: Unreachable switch statement
class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }

        // Unreachable switch statement
        switch (0) {
            case 1:
                // This code is unreachable
                System.out.println("This code is unreachable");
                break;
            default:
                // This code is unreachable
                System.out.println("This code is unreachable");
                break;
        }
    }
}