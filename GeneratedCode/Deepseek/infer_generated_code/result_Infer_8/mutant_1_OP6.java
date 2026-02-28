import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final ReentrantLock lock = new ReentrantLock();
    private String f;

    public void foo(String s) {
        lock.lock();
        try {
            f = s;
            // Adding a unreachable for loop
            for (boolean conditionFor = true; conditionFor; ) {
                // Making the loop unreachable
                break;
            }
        } finally {
            lock.unlock();
        }
    }

    public String showBug(String s) {
        lock.lock();
        try {
            foo(s);
            // Adding a unreachable for loop
            for (boolean conditionFor = true; conditionFor; ) {
                // Making the loop unreachable
                break;
            }
            return f;
        } finally {
            lock.unlock();
        }
    }
}