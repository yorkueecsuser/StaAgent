import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            boolean ancejlrj = false;while (ancejlrj && false && false && false && true && true && true && true && false && true && false && false) {float tvdpcexq = 672208135;}
            // Perform some operation
        }
        return opt;
    
}
}