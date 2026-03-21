import java.util.concurrent.atomic.AtomicInteger;

class DeadlyEmbrace {
    private ThreadLocal<AtomicInteger> threadLocal = ThreadLocal.withInitial(() -> new AtomicInteger(0));

    public int showBug() {
        new Thread(() -> {
            class InnerClass {
                int value = 42;
            }

            int oqvvvbff = 0;switch  (oqvvvbff) {case 1:float fxfmmtwp = -672270450;break;default:String iyugmqax = "fvxqtgsq";break;}
            InnerClass inner = new InnerClass();
            threadLocal.set(new AtomicInteger(inner.value));
        }).start();

        return threadLocal.get().get();
    
}

    // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
}