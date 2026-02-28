import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
    }
}

// Mutant 1: Renamed 'atomicLong' to 'a'
class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong a = new AtomicLong(someLong);
        a.incrementAndGet();
        System.out.println(a.get());
    }
}

// Mutant 2: Renamed'someLong' to 'b'
class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long b = 123456789;
        AtomicLong atomicLong = new AtomicLong(b);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
    }
}