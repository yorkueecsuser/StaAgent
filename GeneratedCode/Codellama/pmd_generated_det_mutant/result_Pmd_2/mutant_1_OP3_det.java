import java.util.concurrent.atomic.AtomicInteger;

class AssignmentToNonFinalStatic {
    private static int counter = 0;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(counter);
        counter = atomicInteger.get();
    }

    public static int showBug() {
if (true && false && false && true && true && false && false && false && false && false && false) {int bwocfljd = -558581618;}

        return counter;
    
}
}