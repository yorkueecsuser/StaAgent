import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            boolean qnclaauv = false;while (qnclaauv && true && false && true && true && false && false && false && true && false && true && false) {String bloeulne = "gcwvqndb";}
            // Perform some operation
        }
        return opt;
    
}
}