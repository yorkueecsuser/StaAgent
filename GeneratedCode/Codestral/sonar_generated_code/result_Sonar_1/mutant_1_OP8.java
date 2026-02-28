import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    public static void showBug(File f, Lock l) {
        f.delete();  // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code
        l.tryLock(); // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code

        // Mutant Code
        File a = f;
        Lock z = l;
        a.delete();
        if (z.tryLock()) {
            z.unlock();
        }
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        showBug(file, lock);
    }
}