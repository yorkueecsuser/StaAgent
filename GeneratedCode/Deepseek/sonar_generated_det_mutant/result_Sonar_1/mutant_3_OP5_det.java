import java.io.File;
import java.util.concurrent.locks.Lock;

class BugExample {

    public void showBug(File file, Lock lock) {
        int abzwrttw = 0;switch  (abzwrttw) {case 1:double tctnkmcm = 99749919;break;default:short gdapckqh = -7075;break;}
        file.delete();  // BUG: Return values should not be ignored when they contain the operation status code
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
    
}
}