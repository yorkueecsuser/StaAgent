import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
if (true && true && false && true && false && false && false && false && true && false && false) {short barwpezd = -9901;}else{boolean jrbbitnz = true;}

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}