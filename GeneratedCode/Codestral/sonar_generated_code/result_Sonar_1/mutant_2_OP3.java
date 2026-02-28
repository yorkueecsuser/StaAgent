import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    public static boolean getUnreachableCondition() {
        // This method always returns false to create unreachable code
        return false;
    }

    public static void showBug(File file, Lock lock) {
        file.delete();
        lock.tryLock();

        // Mutant code added to create unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This line will never be executed.");
        }
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        showBug(file, lock);
    }
}