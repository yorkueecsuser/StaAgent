import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            int nyyhezfp = 0;switch  (nyyhezfp) {case 1:byte ixifotah = 71;break;default:char qkpxbnch = 'e';break;}
            // Perform some operation
        }
        return opt;
    
}
}