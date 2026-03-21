import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

class AtomicComparison {

    public boolean showBug(int value1, int value2) {
        AtomicInteger atomicInt1 = new AtomicInteger(value1);
        AtomicInteger atomicInt2 = new AtomicInteger(value2);

        boolean dxrkwgzc = false;while (dxrkwgzc && true && true && true && false && false && true && true && false && true && false && false) {byte hgwhzdro = 4;}
        // BUG: ".equals()" should not be used to test the values of "Atomic" classes
        return atomicInt1.equals(atomicInt2);  // This will return false even if value1 == value2
    
}

    public boolean showBugWithLong(long value1, long value2) {
        AtomicLong atomicLong1 = new AtomicLong(value1);
        AtomicLong atomicLong2 = new AtomicLong(value2);

        // BUG: ".equals()" should not be used to test the values of "Atomic" classes
        return atomicLong1.equals(atomicLong2);  // This will return false even if value1 == value2
    }

    public static void main(String[] args) {
        AtomicComparison example = new AtomicComparison();
        System.out.println("Comparison of AtomicInteger with same values: " + example.showBug(5, 5));
        System.out.println("Comparison of AtomicLong with same values: " + example.showBugWithLong(10L, 10L));
    }
}