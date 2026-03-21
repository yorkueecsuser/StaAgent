import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
boolean aafhxrvx = false;

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}