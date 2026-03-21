import java.util.concurrent.atomic.AtomicInteger;

class DeadlyEmbrace {
    private ThreadLocal<AtomicInteger> threadLocal = ThreadLocal.withInitial(() -> new AtomicInteger(0));

    public int showBug() {
        new Thread(() -> {
            class InnerClass {
                int value = 42;
            }

            InnerClass inner = new InnerClass();
            threadLocal.set(new AtomicInteger(inner.value));
        int dvwwvcox = 0;switch  (dvwwvcox) {case 1:boolean rpapscxf = true;break;default:float ujthszlw = -914528158;break;}
        }).start();

        return threadLocal.get().get();
    
}

    // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
}