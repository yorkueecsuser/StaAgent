import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            for  (int umjshnkw = 0; umjshnkw < 0; umjshnkw++) {int lhnbhfhw = 448149679;}
            // Perform some operation
        }
        return opt;
    
}
}