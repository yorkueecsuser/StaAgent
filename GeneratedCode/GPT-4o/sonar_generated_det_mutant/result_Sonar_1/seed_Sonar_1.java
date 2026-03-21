import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class FileLockExample {

    public void showBug(File file) {
        Lock lock = new ReentrantLock();

        // Attempt to delete the file without checking the operation status
        file.delete(); // BUG: Return values should not be ignored when they contain the operation status code

        // Attempt to acquire the lock without checking the operation status
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
    }
}