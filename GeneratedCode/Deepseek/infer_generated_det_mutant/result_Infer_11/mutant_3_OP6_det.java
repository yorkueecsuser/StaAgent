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
        for  (int vfdbnidz = 0; vfdbnidz < 0; vfdbnidz++) {char gbbbbdmv = 'e';}
        no_lock();
    
}
}