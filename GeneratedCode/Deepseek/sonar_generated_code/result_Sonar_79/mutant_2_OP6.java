import java.util.concurrent.atomic.AtomicInteger;

class VolatileBug {
    private AtomicInteger count = new AtomicInteger(0);
    private boolean boo = false;

    public void incrementCount() {
        count.incrementAndGet();
    }

    public synchronized void toggleBoo(){
        boo =!boo;
    }

    public int showBug() {
        incrementCount();
        for(int i=0; i<0; i++){
            // Unreachable code
            System.out.println("Unreachable loop");
        }
        return count.get();
    }
}