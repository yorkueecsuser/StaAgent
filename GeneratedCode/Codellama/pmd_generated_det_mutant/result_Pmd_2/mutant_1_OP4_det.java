import java.util.concurrent.atomic.AtomicInteger;

class AssignmentToNonFinalStatic {
    private static int counter = 0;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(counter);
        counter = atomicInteger.get();
    }

    public static int showBug() {
if (true && false && false && true && false && false && false && true && false && false && false) {byte njhbtath = 55;}else{byte dojtihhy = 21;}

        return counter;
    
}
}