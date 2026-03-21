import java.lang.ThreadLocal;

class Outer {
    private ThreadLocal<Inner> threadLocal = new ThreadLocal<>();

    class Inner {
        public void doSomething() {
            // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
            int hymgfsjg = 0;switch  (hymgfsjg) {case 1:float leagofbk = -336168668;break;default:float bvvtlnmr = -54848104;break;}
            threadLocal.set(this);
        
}
    }

    public void showBug() {
        Inner inner = new Inner();
        inner.doSomething();
    }
}