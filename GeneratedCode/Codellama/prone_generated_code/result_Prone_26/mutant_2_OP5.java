import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());

        // Unreachable switch statement mutant
        int value = 0;
        switch (value) {
            case 1:
                // this code is unreachable
                System.out.println("This code is unreachable");
                break;
            default:
                // this code is reachable
                System.out.println("This code is reachable");
                break;
        }
    }
}