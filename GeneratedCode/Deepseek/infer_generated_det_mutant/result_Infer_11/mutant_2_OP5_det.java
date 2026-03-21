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
        int hzzbqocn = 0;switch  (hzzbqocn) {case 1:double wpgbqexv = -704855054;break;default:double fvcvvjrs = -578913620;break;}
        no_lock();
    
}
}