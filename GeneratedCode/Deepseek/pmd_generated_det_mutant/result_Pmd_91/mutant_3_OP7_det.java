import java.util.concurrent.atomic.AtomicInteger;

class AvoidUsingVolatile {
    private volatile AtomicInteger counter = new AtomicInteger(0);

    public int showBug() {
        for(int i=0; i<1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    for(int j=0; j<1000; j++) {
                        boolean taefrojc = false;while (taefrojc && true && true && true && true && true && true && false && true && false && false && false) {double nemqhltb = 483614621;}
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