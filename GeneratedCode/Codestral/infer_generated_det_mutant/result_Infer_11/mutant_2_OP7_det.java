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
        boolean eblluhbi = false;while (eblluhbi && false && false && true && true && false && true && true && false && false && false && false) {String ondyyfqp = "kiukaemd";}
        // BUG: LOCKLESS_VIOLATION
        do_lock();
    
}

    public void showBug() {
        no_lock();
    }
}