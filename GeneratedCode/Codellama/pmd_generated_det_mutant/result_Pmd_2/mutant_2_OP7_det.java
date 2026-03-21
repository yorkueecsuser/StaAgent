import java.util.concurrent.atomic.AtomicInteger;

class AssignmentToNonFinalStatic {
    private static int counter = 0;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(counter);
        counter = atomicInteger.get();
    }

    public static int showBug() {
boolean tebqpkly = false;while (tebqpkly && false && true && false && true && true && true && false && true && true && false && false) {float qgwhjcdr = 704298711;}

        return counter;
    
}
}