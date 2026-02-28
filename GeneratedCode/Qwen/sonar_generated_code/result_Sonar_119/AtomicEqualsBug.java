import java.util.concurrent.atomic.AtomicInteger;

class AtomicEqualsBug {

    public boolean showBug(AtomicInteger atomicInt1, AtomicInteger atomicInt2) {
        return atomicInt1.equals(atomicInt2); // BUG: ".equals()" should not be used to test the values of "Atomic" classes
    }

    public static void main(String[] args) {
        AtomicEqualsBug bugDemo = new AtomicEqualsBug();
        AtomicInteger int1 = new AtomicInteger(10);
        AtomicInteger int2 = new AtomicInteger(10);
        
        boolean result = bugDemo.showBug(int1, int2);
        System.out.println("Result of equals comparison: " + result);
    }
}