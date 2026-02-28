import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugExample {

    // BUG: Return values should not be ignored when they contain the operation status code
    public String doSomethingNew(File file, Lock lock) {
        String resultNew = "";
        if (lock.tryLock()) {
            resultNew += "Locked successfully\n";
        } else {
            resultNew += "Lock failed\n";
        }
        if (file.delete()) {
            resultNew += "Deleted successfully\n";
        } else {
            resultNew += "Delete failed\n";
        }
        return resultNew;
    }

    // This method demonstrates the bug by calling the doSomething method and displaying the results
    public void showBug() {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        System.out.println(doSomethingNew(file, lock));
    }
}