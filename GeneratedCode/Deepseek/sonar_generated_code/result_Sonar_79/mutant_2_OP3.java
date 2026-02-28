import java.util.concurrent.atomic.AtomicInteger;

class VolatileBug {
    private AtomicInteger count = new AtomicInteger(0);
    private boolean boo = false;
    private boolean alwaysFalse = false;

    public void incrementCount() {
        if (alwaysFalse) {
            count.incrementAndGet();  // Mutation Operator: Unreachable if statement
        }
    }

    public synchronized void toggleBoo(){
        if (alwaysFalse) {
            boo =!boo;  // Mutation Operator: Unreachable if statement
        }
    }

    public int showBug() {
        incrementCount();
        return count.get();
    }
}