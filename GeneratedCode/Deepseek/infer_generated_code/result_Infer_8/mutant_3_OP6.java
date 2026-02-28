import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    private final ReentrantLock lock = new ReentrantLock();
    private String f;

    public void foo(String s) {
        lock.lock();
        try {
            f = s; // protected access here
            // Mutation Operator: Unreachable for loop
            for(int i = 0; getCondition(); i++) {
                System.out.println("This is an unreachable loop");
            }
            // END of mutation operator
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
    
    private boolean getCondition() {
        return false;
    }
}