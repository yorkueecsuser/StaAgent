import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    public static boolean getCondition() {
        return false;
    }

    public static void showBug(File file, Lock lock) {
        for (int i = 0; getCondition(); i++) {
            // Unreachable block start
            System.out.println("This is an unreachable loop.");
            // Unreachable block end
        }
        file.delete();  // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code
        lock.tryLock(); // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        showBug(file, lock);
    }
}