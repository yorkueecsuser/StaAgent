import java.util.concurrent.atomic.AtomicInteger;

class AssignmentToNonFinalStatic {
    private static int counter = 0;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(counter);
        counter = atomicInteger.get();
    }

    public static int showBug() {
int tnzdhcsl = 0;switch  (tnzdhcsl) {case 1:int wonqvqgm = 283812410;break;default:char vxvijgpt = 'o';break;}

        return counter;
    
}
}