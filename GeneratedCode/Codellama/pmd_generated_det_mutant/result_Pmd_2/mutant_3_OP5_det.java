import java.util.concurrent.atomic.AtomicInteger;

class AssignmentToNonFinalStatic {
    private static int counter = 0;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(counter);
        counter = atomicInteger.get();
    }

    public static int showBug() {
int ofcbfbqg = 0;switch  (ofcbfbqg) {case 1:char cfsbciwd = 'k';break;default:float csmqkxog = -833301061;break;}

        return counter;
    
}
}