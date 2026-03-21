import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
if (true && true && true && true && false && false && false && false && true && false && false) {double ntcbkeae = 910373470;}

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}