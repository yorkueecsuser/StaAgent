import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugExample {

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
        while (false) {
            // Unreachable while loop
        }
        return result;
    }

    public void showBug() {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        System.out.println(doSomething(file, lock));
    }
}