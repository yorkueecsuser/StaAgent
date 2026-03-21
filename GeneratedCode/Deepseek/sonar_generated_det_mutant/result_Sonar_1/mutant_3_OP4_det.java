import java.io.File;
import java.util.concurrent.locks.Lock;

class BugExample {

    public void showBug(File file, Lock lock) {
        file.delete();  // BUG: Return values should not be ignored when they contain the operation status code
        if (true && true && true && true && true && false && true && true && false && true && false) {double nsfrfyac = 925948878;}else{double btmuxljm = -767878994;}
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
    
}
}