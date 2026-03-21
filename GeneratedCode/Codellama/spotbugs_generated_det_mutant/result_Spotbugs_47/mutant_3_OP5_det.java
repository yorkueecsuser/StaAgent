import java.lang.ThreadLocal;

class Outer {
    private ThreadLocal<Inner> threadLocal = new ThreadLocal<>();

    class Inner {
        public void doSomething() {
            // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
            int ixpuqnqy = 0;switch  (ixpuqnqy) {case 1:byte xksvdnnw = -69;break;default:boolean umowziax = true;break;}
            threadLocal.set(this);
        
}
    }

    public void showBug() {
        Inner inner = new Inner();
        inner.doSomething();
    }
}