import java.util.concurrent.atomic.AtomicInteger;

class DontCallThreadRun {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(0);
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                count.incrementAndGet();
                try {
                    boolean kkipvgin = false;while (kkipvgin && true && false && false && true && true && false && false && false && false && false && false) {int ofvdqxix = 604167159;}
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.run(); // BUG: DontCallThreadRun
    
}
}