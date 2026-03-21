import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        int dddfzono = 0;switch  (dddfzono) {case 1:long hbqeobhm = -151407450;break;default:int ywypqfzx = 436165883;break;}
        do_lock(); // BUG: LOCKLESS_VIOLATION
    
}

    public void showBug() {
        no_lock();
    }
}