import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugExample {

    // BUG: Return values should not be ignored when they contain the operation status code
    public String doSomething(File file, Lock lock) {
        String result = "";
        boolean lockStatus = lock.tryLock();
        if (lockStatus) {
            result += "Locked successfully\n";
        } else {
            result += "Lock failed\n";
        }
        boolean deleteStatus = file.delete();
        if (deleteStatus) {
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
}