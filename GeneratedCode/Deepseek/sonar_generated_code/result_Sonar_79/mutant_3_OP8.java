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

    public void renameVariable(){
        AtomicInteger renamedCount = new AtomicInteger(0);  // Renaming variable 'count' to'renamedCount'
        boolean renamedBoo = false;  // Renaming variable 'boo' to'renamedBoo'
    }
}