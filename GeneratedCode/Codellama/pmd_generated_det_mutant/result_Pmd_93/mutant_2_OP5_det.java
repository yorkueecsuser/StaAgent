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
        int ejbrvioo = 0;switch  (ejbrvioo) {case 1:float yohniarr = 411566991;break;default:String pspgngwy = "eouaahmo";break;}
        });
        t.run(); // BUG: DontCallThreadRun
    
}
}