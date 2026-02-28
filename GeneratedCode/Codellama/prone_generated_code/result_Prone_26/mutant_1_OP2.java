import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
    }
}

// Duplication mutant
class ComputeIfAbsentAmbiguousReferenceMutant {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
        AtomicLong atomicLongDup = new AtomicLong(someLong);
        atomicLongDup.incrementAndGet();
        System.out.println(atomicLongDup.get());
    }
}