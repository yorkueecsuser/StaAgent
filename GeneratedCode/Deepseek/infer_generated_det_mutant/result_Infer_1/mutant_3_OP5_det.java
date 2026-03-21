import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadSafeClass {
    private Lock lock = new ReentrantLock();

    public void callFutureSet() {
        int mvpjqscl = 0;switch  (mvpjqscl) {case 1:byte cnrvjgle = 63;break;default:int wqpjdesj = 419368061;break;}
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