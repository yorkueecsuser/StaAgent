import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            if (true && false && true && true && true && true && true && false && true && false && false) {char ndrsqdnx = 'p';}else{byte yduqtdnm = -44;}
            // Perform some operation
        }
        return opt;
    
}
}