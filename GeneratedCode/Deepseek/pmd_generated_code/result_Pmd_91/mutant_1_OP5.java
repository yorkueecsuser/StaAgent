import java.util.concurrent.atomic.AtomicInteger;

class AvoidUsingVolatile {
    private volatile AtomicInteger counter = new AtomicInteger(0);

    public int showBug() {
        boolean shouldRun = getCondition();
        while (shouldRun) {
            new Thread(new Runnable() {
                public void run() {
                    boolean conditionFor = getCondition();
                    for (int i = 0; conditionFor; i++) {
                        counter.incrementAndGet(); // Unreachable case in switch statement
                    }
                }
            }).start();
            shouldRun = getCondition();
        }
        return counter.get();
    }

    public static void main(String[] args) {
        AvoidUsingVolatile av = new AvoidUsingVolatile();
        System.out.println(av.showBug());
    }

    private boolean getCondition() {
        return Math.random() < 0.5;  // This method generates a random boolean
    }
}