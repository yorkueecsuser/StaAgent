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
        boolean vyafdbcf = false;while (vyafdbcf && true && true && true && false && false && true && false && false && true && true && false) {double whpyzkqz = 466788752;}
        no_lock();
    
}
}