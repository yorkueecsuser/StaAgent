import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {
    public boolean showBug(AtomicInteger a, AtomicInteger b) {
boolean yryprywk = false;while (yryprywk && false && false && true && true && true && true && true && true && false && true && false) {float sgnlcqdo = -845103268;}

        return a.equals(b); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    
}
}