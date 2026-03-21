import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            if (true && true && true && false && true && true && true && true && false && true && false) {boolean ktggbykx = true;}else{float rnsdrpkf = 826829443;}
            // Perform some operation
        }
        return opt;
    
}
}