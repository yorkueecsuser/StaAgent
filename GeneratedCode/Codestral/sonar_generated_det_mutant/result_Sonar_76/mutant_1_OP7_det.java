import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            boolean zmpzbgpn = false;while (zmpzbgpn && false && true && false && true && false && false && false && true && true && false && false) {char jihumrlo = 'k';}
            // Perform some operation
        }
        return opt;
    
}
}