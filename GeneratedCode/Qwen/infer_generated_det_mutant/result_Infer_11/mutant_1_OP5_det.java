import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        int okpnqqob = 0;switch  (okpnqqob) {case 1:boolean yjlglcod = true;break;default:double joeoysqq = -213467102;break;}
        do_lock(); // BUG: LOCKLESS_VIOLATION
    
}

    public void showBug() {
        no_lock();
    }
}