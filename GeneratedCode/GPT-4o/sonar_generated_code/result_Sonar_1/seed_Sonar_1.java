import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class StatusCodeBugExample {

    private File file;
    private Lock lock;

    public StatusCodeBugExample(File file) {
        this.file = file;
        this.lock = new ReentrantLock();
    }

    public void showBug() {
        // This line demonstrates the bug with ignoring the return value of file.delete()
        file.delete(); // BUG: Return values should not be ignored when they contain the operation status code
        
        // This line demonstrates the bug with ignoring the return value of lock.tryLock()
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
    }

    public static void main(String[] args) {
        File file = new File("example.txt");
        StatusCodeBugExample example = new StatusCodeBugExample(file);
        example.showBug();
    }
}