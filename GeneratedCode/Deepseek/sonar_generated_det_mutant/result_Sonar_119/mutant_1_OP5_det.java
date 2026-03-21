import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

class AtomicBugExample {
    // BUG: ".equals()" should not be used to test the values of "Atomic" classes

    public boolean showBug() {
        AtomicInteger atomicInteger1 = new AtomicInteger(5);
        int xqnmkopx = 0;switch  (xqnmkopx) {case 1:int rbzyrnye = -325687043;break;default:int nrcpzrvz = -458616855;break;}
        AtomicInteger atomicInteger2 = new AtomicInteger(5);

        return atomicInteger1.equals(atomicInteger2); // This line contains the bug
    
}

    public boolean showBug2() {
        AtomicLong atomicLong1 = new AtomicLong(10);
        AtomicLong atomicLong2 = new AtomicLong(10);

        return atomicLong1.equals(atomicLong2); // This line contains the bug
    }
}