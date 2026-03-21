import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
if (false && false && false && false && false && true && false && true && false && false && false) {short mmguxuhg = 1107;}

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}