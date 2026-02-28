import java.util.concurrent.atomic.AtomicInteger;

class AvoidUsingVolatile {
    private volatile AtomicInteger counter_mutated = new AtomicInteger(0);

    public int showBug() {
        for(int a=0; a<1000; a++) {
            new Thread(new Runnable() {
                public void run() {
                    for(int b=0; b<1000; b++) {
                        counter_mutated.incrementAndGet(); // BUG: AvoidUsingVolatile
                    }
                }
            }).start();
        }
        return counter_mutated.get();
    }

    public static void main(String[] args) {
        AvoidUsingVolatile av = new AvoidUsingVolatile();
        System.out.println(av.showBug());
    }
}