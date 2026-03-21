import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            if (false && false && false && true && false && false && true && true && false && false && false) {char gxdgydqi = 'd';}
            // Perform some operation
        }
        return opt;
    
}
}