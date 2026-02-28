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

    public void addUnreachableSwitchStatement() {
        // Non-final variable to avoid "unreachable statement" error
        boolean shouldExecuteUnreachableSwitch = getShouldExecuteUnreachableSwitch();

        // Unreachable switch statement
        if (shouldExecuteUnreachableSwitch) {
            int unreachableValue = 0;
            switch (unreachableValue) {
                case 0:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }
    }

    // Helper method to avoid "unreachable statement" error
    private boolean getShouldExecuteUnreachableSwitch() {
        return false;
    }
}