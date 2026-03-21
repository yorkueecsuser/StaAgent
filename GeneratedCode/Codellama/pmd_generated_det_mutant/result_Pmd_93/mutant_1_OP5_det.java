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
                }
            }
        int okecdeuv = 0;switch  (okecdeuv) {case 1:byte xjylztmm = -117;break;default:float ztiigtdz = -986936798;break;}
        });
        t.run(); // BUG: DontCallThreadRun
    
}
}