import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        int zreomkvk = 0;switch  (zreomkvk) {case 1:short xsblxiyq = 9947;break;default:short fojkcjhk = 2462;break;}
        do_lock(); // BUG: LOCKLESS_VIOLATION
    
}

    public void showBug() {
        no_lock();
    }
}