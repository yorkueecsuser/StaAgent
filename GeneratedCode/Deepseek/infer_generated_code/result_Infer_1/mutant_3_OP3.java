import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadSafeClass {
    private Lock lock = new ReentrantLock();

    public void callFutureSet() {
        lock.lock();
        System.out.println("Executing arbitrary code while holding a lock");
        lock.unlock();
    }

    public void example_of_bad_pattern() {
        callFutureSet();  // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
    }

    public void nested_bad_pattern_no_report(Object o) {
        synchronized (o) {
            example_of_bad_pattern();
        }
    }

    public boolean getFalse() {
        return false;
    }

    public boolean getTrue() {
        return true;
    }

    public void unreachableIfStatement() {
        if (getFalse()) {
            System.out.println("This code is unreachable");
        }
    }

    public void unreachableWhileLoop() {
        while (getFalse()) {
            System.out.println("This code is unreachable");
        }
    }

    public void unreachableForLoop() {
        for (; getFalse();) {
            System.out.println("This code is unreachable");
        }
    }

    public void unreachableIfElseStatement() {
        if (getFalse()) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }

    public void unreachableSwitchStatement() {
        switch (getFalse()? 1 : 0) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is reachable");
                break;
        }
    }
}