import java.util.concurrent.atomic.AtomicInteger;

class VolatileBug {
    private AtomicInteger count = new AtomicInteger(0);
    private boolean boo = false;

    public void incrementCount() {
        count.incrementAndGet();  // BUG: "volatile" variables should not be used with compound operators
    }

    public synchronized void toggleBoo(){
        boo =!boo;  // BUG: "volatile" variables should not be used with compound operators
    }

    public int showBug() {
        incrementCount();
        return count.get();
    }

    // Mutant Code
    public void unreachableForLoop() {
        boolean conditionFor = true;
        for (int i = 0; conditionFor; i++) {
            if (i > 10) {
                break;
            }
        }
    }
}