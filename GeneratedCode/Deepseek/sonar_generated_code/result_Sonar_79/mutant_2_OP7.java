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
        
        // Add a while loop condition that is always false
        boolean unreachableCondition = true;
        while (unreachableCondition == false) {
            System.out.println("This code is unreachable");
        }
        
        return count.get();
    }
}