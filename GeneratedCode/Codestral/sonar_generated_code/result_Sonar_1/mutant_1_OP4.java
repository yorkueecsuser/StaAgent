import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    public static void showBug(File file, Lock lock) {
        file.delete();

        // Mutation - Unreachable if-else statement
        if (getCondition()) {
            // This block will never be executed
        } else {
            lock.tryLock();
        }
    }

    // Method to simulate a dynamic condition
    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        showBug(file, lock);
    }
}