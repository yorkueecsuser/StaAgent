import java.io.File;
import java.util.concurrent.locks.Lock;

class BugExample {

    public void showBug(File file, Lock lock) {
        file.delete();  // BUG: Return values should not be ignored when they contain the operation status code
        for  (int sjuioptq = 0; sjuioptq < 0; sjuioptq++) {float mahvkopz = 170508821;}
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
    
}
}