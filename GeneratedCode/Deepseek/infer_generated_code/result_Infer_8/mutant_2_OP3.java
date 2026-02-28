import java.util.concurrent.locks.ReentrantLock;

class Mutation {
    private final ReentrantLock lock = new ReentrantLock();
    private String f;

    public void foo(String s) {
        lock.lock();
        try {
            f = s; // protected access here
            // Mutated code:
            if (false) {
                // Unreachable code
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