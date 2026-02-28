import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug(File file, Lock lock) {
        file.delete();  // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code

        // Unreachable switch statement
        boolean condition = getFalseCondition();
        if (condition) {
            int value = 0; // This value is never used, but it's here to avoid compilation errors
            switch(value) {
                case 1:
                    // This code is unreachable
                    System.out.println("This line will never be executed.");
                    break;
            }
        }

        lock.tryLock(); // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        showBug(file, lock);
    }
}