import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    public static void showBug(File file, Lock lock) {
        file.delete();
        lock.tryLock();

        // Introducing the mutation: unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable since getCondition() always returns false
            System.out.println("Unreachable block of code");
        } else {
            // This block is also unreachable
            System.out.println("Another unreachable block of code");
        }
    }

    private static boolean getCondition() {
        // This method always returns false to make the if-else statement unreachable
        return false;
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        showBug(file, lock);
    }
}