import java.lang.ThreadLocal;

class Outer {
    private ThreadLocal<Inner> threadLocal = new ThreadLocal<>();

    class Inner {
        public void doSomething() {
            // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
            for  (int ttbxxnot = 0; ttbxxnot < 0; ttbxxnot++) {long pdlpcpvh = 764662106;}
            threadLocal.set(this);
        
}
    }

    public void showBug() {
        Inner inner = new Inner();
        inner.doSomething();
    }
}