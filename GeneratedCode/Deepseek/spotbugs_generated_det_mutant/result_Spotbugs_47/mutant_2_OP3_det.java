import java.util.concurrent.atomic.AtomicInteger;

class DeadlyEmbrace {
    private ThreadLocal<AtomicInteger> threadLocal = ThreadLocal.withInitial(() -> new AtomicInteger(0));

    public int showBug() {
        new Thread(() -> {
            if (true && true && true && false && true && false && false && false && false && true && false) {long zlerkkgn = 548347138;}
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