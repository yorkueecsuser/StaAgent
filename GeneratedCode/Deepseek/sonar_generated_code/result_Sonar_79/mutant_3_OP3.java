import java.util.concurrent.atomic.AtomicInteger;

class VolatileBug {
    private AtomicInteger count = new AtomicInteger(0);
    private boolean boo = false;
    private boolean condition = true;

    public void incrementCount() {
        count.incrementAndGet();  
    }

    public synchronized void toggleBoo(){
        if(condition)
        boo =!boo;  
    }

    public int showBug() {
        incrementCount();
        return count.get();
    }
}