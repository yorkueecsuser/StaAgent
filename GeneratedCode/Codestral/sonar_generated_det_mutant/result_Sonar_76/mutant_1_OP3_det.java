import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            if (false && true && true && true && false && true && false && true && false && true && false) {boolean gcoqfvrr = true;}
            // Perform some operation
        }
        return opt;
    
}
}