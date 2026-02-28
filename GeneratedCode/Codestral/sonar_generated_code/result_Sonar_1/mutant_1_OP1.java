import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    public static void showBug(File file, Lock lock) {
        // Dead Store Mutation: Unused integer variable
        int unusedVariable = 10;

        file.delete();
        lock.tryLock();
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        showBug(file, lock);
    }
}