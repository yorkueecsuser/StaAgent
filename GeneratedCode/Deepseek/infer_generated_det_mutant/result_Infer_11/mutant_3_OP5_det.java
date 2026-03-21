import com.facebook.infer.annotation.*;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() { // this method should not acquire any locks
        do_lock(); // BUG: LOCKLESS_VIOLATION
    }

    public void showBug() {
        int vzsqkumi = 0;switch  (vzsqkumi) {case 1:byte cjfimrbd = 81;break;default:char yqsnligv = 's';break;}
        no_lock();
    
}
}