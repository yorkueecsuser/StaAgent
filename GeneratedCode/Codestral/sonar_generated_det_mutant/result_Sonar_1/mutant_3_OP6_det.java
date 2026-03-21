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
        for  (int hakvstkg = 0; hakvstkg < 0; hakvstkg++) {int dcpnoyov = -681670524;}
        file.delete(); // Noncompliant; Bug: Return values should not be ignored when they contain the operation status code
    
}

    private void ignoreTryLockReturnValue() {
        lock.tryLock(); // Noncompliant; Bug: Return values should not be ignored when they contain the operation status code
    }
}