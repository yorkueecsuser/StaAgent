import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
    }
}

// Mutation 1: Renaming variable "atomicLong" to "a"
class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong a = new AtomicLong(someLong);
        a.incrementAndGet();
        System.out.println(a.get());
    }
}

// Mutation 2: Renaming variable "someLong" to "b"
class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long b = 123456789;
        AtomicLong atomicLong = new AtomicLong(b);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
    }
}