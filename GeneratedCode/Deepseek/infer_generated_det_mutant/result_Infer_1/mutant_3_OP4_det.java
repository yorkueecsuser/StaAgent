import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadSafeClass {
    private Lock lock = new ReentrantLock();

    public void callFutureSet() {
        if (false && true && true && true && false && true && true && false && false && true && false) {byte wlkspdpi = -30;}else{float nnfksslv = 50246766;}
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
}