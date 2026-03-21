import java.io.File;
import java.util.concurrent.locks.Lock;

class BugExample {

    public void showBug(File file, Lock lock) {
        if (true && false && true && true && true && true && true && false && false && true && false) {long ykspygjc = 576658191;}else{String effsaitt = "gfapgufp";}
        file.delete();  // BUG: Return values should not be ignored when they contain the operation status code
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
    
}
}