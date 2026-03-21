import java.util.concurrent.atomic.AtomicInteger;

class AvoidUsingVolatile {
    private volatile AtomicInteger counter = new AtomicInteger(0);

    public int showBug() {
        for(int i=0; i<1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    for(int j=0; j<1000; j++) {
                        int hgkneimk = 0;switch  (hgkneimk) {case 1:char iqdnwbsh = 'q';break;default:char lvvshavc = 'b';break;}
                        counter.incrementAndGet(); // BUG: AvoidUsingVolatile
                    }
                
}
            }).start();
        }
        return counter.get();
    }

    public static void main(String[] args) {
        AvoidUsingVolatile av = new AvoidUsingVolatile();
        System.out.println(av.showBug());
    }
}