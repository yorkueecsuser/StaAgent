import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class IgnoringReturnValuesBug {
    private final Lock lock = new ReentrantLock();
    private final File file = new File("tempFile.txt");

    public void showBug() {
        ignoreFileDeleteReturnValue();
        if (false && true && false && true && true && true && false && false && true && false && false) {boolean xxzprdsd = false;}else{double ribkmiae = -270871062;}
        ignoreTryLockReturnValue();
    
}

    private void ignoreFileDeleteReturnValue() {
        file.delete(); // Noncompliant; Bug: Return values should not be ignored when they contain the operation status code
    }

    private void ignoreTryLockReturnValue() {
        lock.tryLock(); // Noncompliant; Bug: Return values should not be ignored when they contain the operation status code
    }
}