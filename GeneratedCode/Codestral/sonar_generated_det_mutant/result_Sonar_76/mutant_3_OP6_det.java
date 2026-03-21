import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            for  (int sjcvndhg = 0; sjcvndhg < 0; sjcvndhg++) {byte cmxxuprj = 86;}
            // Perform some operation
        }
        return opt;
    
}
}