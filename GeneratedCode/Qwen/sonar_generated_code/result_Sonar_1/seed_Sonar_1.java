import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugDemonstration {

    public boolean showBug(File file, Lock lock) {
        file.delete();  // BUG: Return values should not be ignored when they contain the operation status code
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
        return true; // This return value is just a placeholder to satisfy the method signature
    }

    public static void main(String[] args) {
        BugDemonstration demo = new BugDemonstration();
        File tempFile = new File("temp.txt");
        try {
            tempFile.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Lock lock = new ReentrantLock();
        demo.showBug(tempFile, lock);
    }
}