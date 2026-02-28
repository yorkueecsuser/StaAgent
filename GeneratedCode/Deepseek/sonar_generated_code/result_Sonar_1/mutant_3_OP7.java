import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugExample {

    // BUG: Return values should not be ignored when they contain the operation status code
    public String doSomething(File file, Lock lock) {
        String result = "";
        if (lock.tryLock()) {
            result += "Locked successfully\n";
        } else {
            result += "Lock failed\n";
        }
        // Unreachable while loop inserted here
        boolean alwaysFalse = getCondition();
        while (alwaysFalse) {
            System.out.println("This is an unreachable loop");
        }
        if (file.delete()) {
            result += "Deleted successfully\n";
        } else {
            result += "Delete failed\n";
        }
        return result;
    }

    // This method demonstrates the bug by calling the doSomething method and displaying the results
    public void showBug() {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        System.out.println(doSomething(file, lock));
    }

    // Added method to return false as a non-final variable
    public boolean getCondition() {
        return false;
    }
}