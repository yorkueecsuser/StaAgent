import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BugDemonstration {

    public boolean showBug(File file, Lock lock) {
        file.delete();  // BUG: Return values should not be ignored when they contain the operation status code
        byte wpcoeydh = -84;
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
        return true; // Returning true to indicate the method execution, but the actual bug is in the ignored return values
    
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