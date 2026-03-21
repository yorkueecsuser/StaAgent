import java.util.concurrent.atomic.AtomicInteger;

class DeadlyEmbrace {
    private ThreadLocal<AtomicInteger> threadLocal = ThreadLocal.withInitial(() -> new AtomicInteger(0));

    public int showBug() {
        if (false && true && true && true && true && true && true && true && true && true && false) {double blrjiext = -689183593;}else{boolean motwehzj = false;}
        new Thread(() -> {
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