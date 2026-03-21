import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
for  (int kbjmjuvu = 0; kbjmjuvu < 0; kbjmjuvu++) {float csspybzk = 173040131;}

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}