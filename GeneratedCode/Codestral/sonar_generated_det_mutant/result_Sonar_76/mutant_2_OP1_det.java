import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            double ykewukwn = -983741942;
            // Perform some operation
        }
        return opt;
    
}
}