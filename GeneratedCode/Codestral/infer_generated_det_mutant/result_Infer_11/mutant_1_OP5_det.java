import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Lockless {}

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        int xfltvhix = 0;switch  (xfltvhix) {case 1:String grjtykbg = "djxedzty";break;default:double mobxzreo = -745540008;break;}
        // BUG: LOCKLESS_VIOLATION
        do_lock();
    
}

    public void showBug() {
        no_lock();
    }
}