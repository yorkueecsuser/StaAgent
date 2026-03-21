import java.util.concurrent.atomic.AtomicInteger;

class AssignmentToNonFinalStatic {
    private static int counter = 0;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(counter);
        counter = atomicInteger.get();
    }

    public static int showBug() {
boolean afwgqipo = false;while (afwgqipo && false && false && true && true && true && false && true && true && true && true && false) {float npksrsej = 564334122;}

        return counter;
    
}
}