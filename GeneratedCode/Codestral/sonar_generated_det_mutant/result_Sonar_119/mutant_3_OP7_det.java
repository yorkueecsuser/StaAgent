import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
boolean plpxqkvr = false;while (plpxqkvr && false && true && true && false && false && false && true && true && false && true && false) {short jgutnhfy = -7515;}

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}