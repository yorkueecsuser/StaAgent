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
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This if block is never executed due to the mutation.
            result += "If block executed but shouldn't have\n";
        } else {
            // This else block is never executed due to the mutation.
            result += "Else block executed but shouldn't have\n";
        }
        return result;
    }

    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        System.out.println(doSomething(file, lock));
    }
}