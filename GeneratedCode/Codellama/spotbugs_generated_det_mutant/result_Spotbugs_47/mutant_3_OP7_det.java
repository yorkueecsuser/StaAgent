import java.lang.ThreadLocal;

class Outer {
    private ThreadLocal<Inner> threadLocal = new ThreadLocal<>();

    class Inner {
        public void doSomething() {
            // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
            boolean rmhxfqvu = false;while (rmhxfqvu && false && false && true && false && false && true && true && true && true && true && false) {char tvfpxuud = 'x';}
            threadLocal.set(this);
        
}
    }

    public void showBug() {
        Inner inner = new Inner();
        inner.doSomething();
    }
}