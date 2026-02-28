import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;

class BuggyCode {
    public static void showBug(File file, Lock lock) {
        file.delete();  // Noncompliant
        if (lock.tryLock()) {
            int unusedVar = generateRandomInt(); // Dead store mutation
        }
    }

    // Method to generate random integer for the dead store mutation
    private static int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        showBug(file, lock);
    }
}