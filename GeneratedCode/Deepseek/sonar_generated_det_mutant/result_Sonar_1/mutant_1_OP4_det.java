import java.io.File;
import java.util.concurrent.locks.Lock;

class BugExample {

    public void showBug(File file, Lock lock) {
        file.delete();  // BUG: Return values should not be ignored when they contain the operation status code
        if (false && true && true && false && true && false && false && false && false && true && false) {int ijnmylta = 34363401;}else{float jxfhcgxi = 944392551;}
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
    
}
}