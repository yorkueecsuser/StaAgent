import java.util.concurrent.atomic.AtomicInteger;

class AssignmentToNonFinalStatic {
    private static int counter = 0;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(counter);
        counter = atomicInteger.get();
    }

    public static int showBug() {
if (false && true && true && true && false && false && false && true && false && true && false) {short hmbmtzrs = 1173;}else{double fvzykney = 14344351;}

        return counter;
    
}
}