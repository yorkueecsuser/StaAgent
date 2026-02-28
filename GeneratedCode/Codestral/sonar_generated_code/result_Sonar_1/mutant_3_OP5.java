import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    public static void showBug(File file, Lock lock) {
        file.delete();  // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code

        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This case is unreachable because getValue() never returns 1
                    lock.tryLock(); // Noncompliant, Bug: Return values should not be ignored when they contain the operation status code
                    break;
            }
        }
    }

    private static boolean getCondition() {
        // This method is used to dynamically determine the condition for the if statement.
        // It always returns false to make the following switch statement unreachable.
        return false;
    }

    private static int getValue() {
        // This method is used to dynamically determine the value for the switch statement.
        // It never returns 1, which is the case that we added to the switch statement.
        return 0;
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        showBug(file, lock);
    }
}