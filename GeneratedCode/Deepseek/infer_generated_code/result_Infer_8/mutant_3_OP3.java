import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final ReentrantLock lock = new ReentrantLock();
    private String f;

    public void foo(String s) {
        lock.lock();
        try {
            f = s; // protected access here
            // Mutated Code: Adding an unreachable if branch to create a false condition
            if (false) {
                // This code will never be executed
                System.out.println("This code is unreachable");
            }
        } finally {
            lock.unlock();
        }
    }

    public String showBug(String s) {
        lock.lock();
        try {
            foo(s);
            return f;
        } finally {
            lock.unlock();
        }
    }
}