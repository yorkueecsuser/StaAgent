import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    public static void showBug(File file, Lock lock) {
        File f = file; // Mutant code: Renamed variable 'file' to 'f'
        Lock l = lock; // Mutant code: Renamed variable 'lock' to 'l'
        f.delete(); // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code
        l.tryLock(); // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        showBug(file, lock);
    }
}