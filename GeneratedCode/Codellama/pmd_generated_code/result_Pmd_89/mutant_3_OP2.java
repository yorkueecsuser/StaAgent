import java.util.concurrent.locks.ReentrantLock;

class SynchronizedBugExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void showBug() {
        // BUG: AvoidSynchronizedStatement
        synchronized (lock) {
            System.out.println("Buggy code executed");
        }
    }

    public void duplicatedMethod() {
        // duplicated method to demonstrate mutation
        System.out.println("Duplicated method executed");
    }
}