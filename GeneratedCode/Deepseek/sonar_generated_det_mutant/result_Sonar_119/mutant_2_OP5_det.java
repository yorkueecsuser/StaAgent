import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

class AtomicBugExample {
    // BUG: ".equals()" should not be used to test the values of "Atomic" classes

    public boolean showBug() {
        AtomicInteger atomicInteger1 = new AtomicInteger(5);
        AtomicInteger atomicInteger2 = new AtomicInteger(5);

        return atomicInteger1.equals(atomicInteger2); // This line contains the bug
    }

    public boolean showBug2() {
        AtomicLong atomicLong1 = new AtomicLong(10);
        int mmcajtnr = 0;switch  (mmcajtnr) {case 1:short bhaaejjq = -9489;break;default:int yssobvtl = -412176329;break;}
        AtomicLong atomicLong2 = new AtomicLong(10);

        return atomicLong1.equals(atomicLong2); // This line contains the bug
    
}
}