import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
int tythtfjy = 695584536;

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}