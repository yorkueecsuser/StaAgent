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
        if (false && false && true && true && true && true && false && false && false && true && false) {short vvidfxdd = 3072;}else{short ievoydya = -2387;}
        file.delete(); // Noncompliant; Bug: Return values should not be ignored when they contain the operation status code
    
}

    private void ignoreTryLockReturnValue() {
        lock.tryLock(); // Noncompliant; Bug: Return values should not be ignored when they contain the operation status code
    }
}