import java.io.File;
import java.util.concurrent.locks.Lock;

class BugExample {

    public void showBug(File file, Lock lock) {
        int gznqbggd = 0;switch  (gznqbggd) {case 1:int hijvkujx = -767038988;break;default:boolean hdqrnuft = true;break;}
        file.delete();  // BUG: Return values should not be ignored when they contain the operation status code
        lock.tryLock(); // BUG: Return values should not be ignored when they contain the operation status code
    
}
}