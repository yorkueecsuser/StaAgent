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
        String deadVariable = ""; // Mutation: Added a dead variable to serve as a dead store
        System.out.println(doSomething(file, lock));
    }
}