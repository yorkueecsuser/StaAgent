import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugExample {

    public String doSomething(File file, Lock lock) {
        String result = "";
        boolean alwaysFalse = false;  // Mutation Operator: Constant Condition: Unreachable if-else statement
        if (lock.tryLock()) {
            result += "Locked successfully\n";
        } else {
            result += "Lock failed\n";
        }
        if (alwaysFalse) {  // Unreachable branch: This condition is always false
            result += "This line will never be executed\n";
        }
        if (file.delete()) {
            result += "Deleted successfully\n";
        } else {
            result += "Delete failed\n";
        }
        return result;
    }

    public void showBug() {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        System.out.println(doSomething(file, lock));
    }
}