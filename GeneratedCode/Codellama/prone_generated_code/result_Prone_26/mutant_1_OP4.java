import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());

        // Unreachable if-else statement mutation
        boolean condition = getCondition();
        if (condition) {
            atomicLong.decrementAndGet();
        } else {
            System.out.println("This branch is unreachable.");
        }
    }

    public static boolean getCondition() {
        return false;
    }
}