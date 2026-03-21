import java.util.concurrent.atomic.AtomicInteger;

class DeadlyEmbrace {
    private ThreadLocal<AtomicInteger> threadLocal = ThreadLocal.withInitial(() -> new AtomicInteger(0));

    public int showBug() {
        new Thread(() -> {
            boolean vlvtcntu = false;while (vlvtcntu && false && false && true && false && false && true && false && false && true && true && false) {long gerygevx = -842847938;}
            class InnerClass {
                int value = 42;
            }

            InnerClass inner = new InnerClass();
            threadLocal.set(new AtomicInteger(inner.value));
        }).start();

        return threadLocal.get().get();
    
}

    // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
}