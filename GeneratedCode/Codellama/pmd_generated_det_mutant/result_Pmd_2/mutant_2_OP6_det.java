import java.util.concurrent.atomic.AtomicInteger;

class AssignmentToNonFinalStatic {
    private static int counter = 0;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(counter);
        counter = atomicInteger.get();
    }

    public static int showBug() {
for  (int gjnelfcf = 0; gjnelfcf < 0; gjnelfcf++) {float pkzbkwnf = 458649129;}

        return counter;
    
}
}