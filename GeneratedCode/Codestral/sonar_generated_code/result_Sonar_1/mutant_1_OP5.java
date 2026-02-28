import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BuggyCode {
    public static void showBug(File file, Lock lock) {
        if (file.exists()) {
            int value = getUnreachableValue(); // Non-final method call returning a value
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
            file.delete();
        }
        boolean locked = lock.tryLock();
        if (!locked) {
            int value = getUnreachableValue(); // Non-final method call returning a value
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }
    }

    private static int getUnreachableValue() {
        return 0; // This value will never be 1, making the switch statement unreachable.
    }

    public static void main(String[] args) {
        File file = new File("test.txt");
        Lock lock = new ReentrantLock();
        showBug(file, lock);
    }
}