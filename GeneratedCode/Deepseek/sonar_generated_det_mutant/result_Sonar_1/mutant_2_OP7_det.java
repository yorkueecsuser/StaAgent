import java.io.File;
import java.util.concurrent.locks.Lock;

class BugExample {

    public void showBug(File file, Lock lock) {
        boolean lwfwlfwa = false;while (lwfwlfwa && true && false && true && false && false && false && false && true && false && true && false) {float vriwmrfe = -807115049;}
        file.delete();  // BUG: Return values should not be ignored when they contain the operation status code
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
    
}
}