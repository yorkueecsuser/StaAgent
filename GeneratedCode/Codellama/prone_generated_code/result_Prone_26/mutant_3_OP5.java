import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    public static void main(String[] args) {
        long someLong = 123456789;
        AtomicLong atomicLong = new AtomicLong(someLong);
        atomicLong.incrementAndGet();
        System.out.println(atomicLong.get());

        // Unreachable switch statement mutation
        switch (false) {
            case 1:
                // code
                break;
            case 2:
                // code
                break;
            default:
                // code
                break;
        }
    }

    private static boolean getCondition() {
        return false;
    }

    private static int getValue() {
        return 0;
    }
}