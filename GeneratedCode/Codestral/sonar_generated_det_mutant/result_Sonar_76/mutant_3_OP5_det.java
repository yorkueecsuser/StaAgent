import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            int rvkdgdtd = 0;switch  (rvkdgdtd) {case 1:String jjlxlfwq = "xslzwrqv";break;default:long zsgavauz = -670927597;break;}
            // Perform some operation
        }
        return opt;
    
}
}