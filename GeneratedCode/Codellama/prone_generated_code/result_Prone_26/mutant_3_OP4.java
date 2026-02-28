import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());

        // Mutant code: Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            atomicLong.decrementAndGet();
        } else {
            atomicLong.incrementAndGet();
        }
    }
}