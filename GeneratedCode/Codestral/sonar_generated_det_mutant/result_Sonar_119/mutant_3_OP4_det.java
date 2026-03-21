import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
if (false && false && true && false && true && false && false && false && true && true && false) {byte ocpwlxrh = -11;}else{long njujecre = 352899139;}

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}