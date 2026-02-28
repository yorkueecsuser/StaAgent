import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());

        // Mutation Operator: Unreachable for loop
        // Description: Inserting unreachable for loop into a randomly selected basic block in the program.
        // The condition of the inserted loop is always false to make it unreachable.
        int i = 0;
        for (; false; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}