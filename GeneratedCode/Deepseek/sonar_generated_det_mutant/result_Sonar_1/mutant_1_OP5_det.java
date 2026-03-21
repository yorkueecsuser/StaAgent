import java.io.File;
import java.util.concurrent.locks.Lock;

class BugExample {

    public void showBug(File file, Lock lock) {
        int omjqumlr = 0;switch  (omjqumlr) {case 1:String iijhyhjl = "jtmxoprx";break;default:short xohfjhfw = -61;break;}
        file.delete();  // BUG: Return values should not be ignored when they contain the operation status code
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
    
}
}