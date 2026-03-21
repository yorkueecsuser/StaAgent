import java.util.concurrent.atomic.AtomicInteger;

class AvoidUsingVolatile {
    private volatile AtomicInteger counter = new AtomicInteger(0);

    public int showBug() {
        { int i=0; do { new Thread(new Runnable() {
                public void run() {
                    for(int j=0; j<1000; j++) {
                        counter.incrementAndGet(); // BUG: AvoidUsingVolatile
                    }
                }
            }).start(); i++; } while (i<1000); }
        return counter.get();
    }

    public static void main(String[] args) {
        AvoidUsingVolatile av = new AvoidUsingVolatile();
        System.out.println(av.showBug());
    }
}