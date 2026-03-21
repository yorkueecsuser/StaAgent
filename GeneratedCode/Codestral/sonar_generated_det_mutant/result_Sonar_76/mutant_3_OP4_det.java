import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            if (false && true && false && true && true && false && true && false && true && true && false) {byte xemgcvjy = 108;}else{int fykrnaab = 488126717;}
            // Perform some operation
        }
        return opt;
    
}
}