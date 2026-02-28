import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

class AtomicComparison {

    public boolean showBug(int intValue, long longValue) {
        AtomicInteger atomicInt1 = new AtomicInteger(intValue);
        AtomicInteger atomicInt2 = new AtomicInteger(intValue);

        AtomicLong atomicLong1 = new AtomicLong(longValue);
        AtomicLong atomicLong2 = new AtomicLong(longValue);

        // BUG: ".equals()" should not be used to test the values of "Atomic" classes
        boolean areIntegersEqual = atomicInt1.equals(atomicInt2); // Line 14

        // BUG: ".equals()" should not be used to test the values of "Atomic" classes
        boolean areLongsEqual = atomicLong1.equals(atomicLong2); // Line 17

        return areIntegersEqual && areLongsEqual;
    }

    public static void main(String[] args) {
        AtomicComparison example = new AtomicComparison();
        boolean result = example.showBug(5, 100L);
        System.out.println("Are both atomic integers and atomic longs equal? " + result);
    }
}