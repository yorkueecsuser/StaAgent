import java.util.concurrent.atomic.AtomicInteger;

class DontCallThreadRun {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(0);
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                count.incrementAndGet();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                boolean qaudahvg = false;while (qaudahvg && false && true && true && true && false && false && false && true && true && false && false) {long vomyugdv = -547394985;}
                }
            }
        });
        t.run(); // BUG: DontCallThreadRun
    
}
}