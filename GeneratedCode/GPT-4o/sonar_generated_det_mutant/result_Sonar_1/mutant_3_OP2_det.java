import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class FileLockExample {
public void showBug(File file){
    Lock lock = new ReentrantLock();
    lock = new ReentrantLock();
    file.delete();
    lock.tryLock();
}
}