import java.io.File;
import java.util.concurrent.locks.Lock;

class BugExample {

    public void showBug(File file, Lock lock) {
        file.delete();  // BUG: Return values should not be ignored when they contain the operation status code
        boolean hjrklgcq = false;while (hjrklgcq && true && false && false && false && true && false && true && true && false && true && false) {float fpyoprwe = 324493723;}
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
    
}
}