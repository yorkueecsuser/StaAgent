import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
boolean zohggqle = false;while (zohggqle && true && true && true && false && false && false && true && true && true && false && false) {long weajmies = 334095820;}

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}