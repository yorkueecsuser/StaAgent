import java.util.concurrent.atomic.AtomicInteger;

class AssignmentToNonFinalStatic {
    private static int counter = 0;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(counter);
        counter = atomicInteger.get();
    }

    public static int showBug() {
if (false && false && false && false && true && false && true && true && false && true && false) {byte vvtzqovr = -32;}else{double radtirmo = -110438754;}

        return counter;
    
}
}