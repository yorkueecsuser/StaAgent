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
        int hzefgkdv = 0;switch  (hzefgkdv) {case 1:byte xxupczim = -111;break;default:byte ljjeqcuy = 101;break;}
        file.delete(); // Noncompliant; Bug: Return values should not be ignored when they contain the operation status code
    
}

    private void ignoreTryLockReturnValue() {
        lock.tryLock(); // Noncompliant; Bug: Return values should not be ignored when they contain the operation status code
    }
}