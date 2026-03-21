import java.lang.ThreadLocal;

class Outer {
    private ThreadLocal<Inner> threadLocal = new ThreadLocal<>();

    class Inner {
        public void doSomething() {
            // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
            boolean stqgddpc = false;while (stqgddpc && true && false && true && false && false && false && false && false && false && true && false) {double rvhbezti = -250151257;}
            threadLocal.set(this);
        
}
    }

    public void showBug() {
        Inner inner = new Inner();
        inner.doSomething();
    }
}