import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    public static void showBug(File file, Lock lock) {
        file.delete();  // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code
        for (int i = 0; isConditionTrue(); i++) { // Added unreachable for loop
            // This loop will never be executed
        }
        lock.tryLock(); // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code
    }

    public static boolean isConditionTrue() {
        return false;  // This always returns false
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        showBug(file, lock);
    }
}