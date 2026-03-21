import java.util.concurrent.atomic.AtomicInteger;

class AssignmentToNonFinalStatic {
    private static int counter = 0;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(counter);
        counter = atomicInteger.get();
    }

    public static int showBug() {
int gedgpvve = 0;switch  (gedgpvve) {case 1:double hqdenhyq = -270209211;break;default:boolean clrkhbyu = true;break;}

        return counter;
    
}
}