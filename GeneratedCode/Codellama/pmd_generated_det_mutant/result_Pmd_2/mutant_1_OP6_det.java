import java.util.concurrent.atomic.AtomicInteger;

class AssignmentToNonFinalStatic {
    private static int counter = 0;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(counter);
        counter = atomicInteger.get();
    }

    public static int showBug() {
for  (int xiurfqmf = 0; xiurfqmf < 0; xiurfqmf++) {byte dokhezbo = 112;}

        return counter;
    
}
}