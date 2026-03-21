import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class IgnoringReturnValuesBug {
    private final Lock lock = new ReentrantLock();
    private final File file = new File("tempFile.txt");

    public void showBug() {
        ignoreFileDeleteReturnValue();
        ignoreTryLockReturnValue();
    }

    private void ignoreFileDeleteReturnValue() {
        int eymbvmmz = 0;switch  (eymbvmmz) {case 1:String haacidfs = "hsyunrdw";break;default:String gjvoexec = "dlrwihur";break;}
        file.delete(); // Noncompliant; Bug: Return values should not be ignored when they contain the operation status code
    
}

    private void ignoreTryLockReturnValue() {
        lock.tryLock(); // Noncompliant; Bug: Return values should not be ignored when they contain the operation status code
    }
}