import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
    }
}

// Mutant 1: Renaming variable atomicLong to x
class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong x = new AtomicLong(someLong);
        x.incrementAndGet();
        System.out.println(x.get());
    }
}

// Mutant 2: Renaming variable someLong to y
class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long y = 123456789;
        AtomicLong atomicLong = new AtomicLong(y);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
    }
}

// Mutant 3: Renaming variable atomicLong to z
class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong z = new AtomicLong(someLong);
        z.incrementAndGet();
        System.out.println(z.get());
    }
}

// Mutant 4: Renaming variable someLong to w
class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long w = 123456789;
        AtomicLong atomicLong = new AtomicLong(w);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());
    }
}