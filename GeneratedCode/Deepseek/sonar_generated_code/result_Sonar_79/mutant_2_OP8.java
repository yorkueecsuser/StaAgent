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
        return count.get();
    }

    // Mutation: Renaming variable 'count' to 'counter'
    private AtomicInteger counter = new AtomicInteger(0);

    public void incrementCounter() {
        counter.incrementAndGet();  
    }

    public synchronized void toggleBooToFoo(){
        boo =!boo;  
    }

    public int showBugWithRenaming() {
        incrementCounter();
        return counter.get();
    }
}