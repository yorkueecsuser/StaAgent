import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            for  (int blfzdiqy = 0; blfzdiqy < 0; blfzdiqy++) {byte qjjgbyql = 31;}
            // Perform some operation
        }
        return opt;
    
}
}