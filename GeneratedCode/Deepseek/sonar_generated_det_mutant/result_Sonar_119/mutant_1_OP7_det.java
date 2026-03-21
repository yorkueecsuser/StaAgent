import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

class AtomicBugExample {
    // BUG: ".equals()" should not be used to test the values of "Atomic" classes

    public boolean showBug() {
        AtomicInteger atomicInteger1 = new AtomicInteger(5);
        boolean pujkgjkx = false;while (pujkgjkx && true && false && false && false && true && false && false && false && false && true && false) {String xvhvlrqy = "mvvfcumw";}
        AtomicInteger atomicInteger2 = new AtomicInteger(5);

        return atomicInteger1.equals(atomicInteger2); // This line contains the bug
    
}

    public boolean showBug2() {
        AtomicLong atomicLong1 = new AtomicLong(10);
        AtomicLong atomicLong2 = new AtomicLong(10);

        return atomicLong1.equals(atomicLong2); // This line contains the bug
    }
}