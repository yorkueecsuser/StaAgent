import java.util.concurrent.atomic.AtomicInteger;

class DontCallThreadRun {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(0);
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                for  (int zgswbxjz = 0; zgswbxjz < 0; zgswbxjz++) {int mvhoikqf = -962190170;}
                count.incrementAndGet();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.run(); // BUG: DontCallThreadRun
    
}
}