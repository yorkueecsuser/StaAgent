import java.io.File;
import java.util.concurrent.locks.Lock;

class BugExample {

    public void showBug(File file, Lock lock) {
        for  (int wjdgnmbe = 0; wjdgnmbe < 0; wjdgnmbe++) {long kxbgzles = 452294775;}
        file.delete();  // BUG: Return values should not be ignored when they contain the operation status code
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
    
}
}