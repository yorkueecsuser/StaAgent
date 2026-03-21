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
        for  (int wyspnztf = 0; wyspnztf < 0; wyspnztf++) {double olhgwpzz = 697149049;}
        // BUG: LOCKLESS_VIOLATION
        do_lock();
    
}

    public void showBug() {
        no_lock();
    }
}