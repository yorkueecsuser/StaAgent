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
        boolean shouldRun = getCondition();
        switch(0) {
            default:
                System.out.println("This will never be executed");
        }
        return count.get();
    }

    private boolean getCondition() {
        return false;
    }
}