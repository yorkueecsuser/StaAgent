import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());

        // Mutated code
        if (false) {
            // This branch is never executed
            atomicLong.decrementAndGet();
            System.out.println(atomicLong.get());
        }
    }
}