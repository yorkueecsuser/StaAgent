import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            if (true && false && false && true && false && true && true && false && false && false && false) {String yekjawxb = "jjfjcymt";}
            // Perform some operation
        }
        return opt;
    
}
}