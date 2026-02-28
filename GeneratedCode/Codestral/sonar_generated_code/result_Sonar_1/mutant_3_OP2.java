import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    public static void showBug(File file, Lock lock) {
        file.delete();  // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code
        lock.tryLock(); // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        File fileDuplicate = new File("test.txt"); // Mutant: Duplicated assignment statement
        Lock lock = new ReentrantLock();
        showBug(file, lock);
    }
}