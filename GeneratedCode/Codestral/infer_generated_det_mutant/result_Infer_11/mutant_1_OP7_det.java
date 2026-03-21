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
        boolean czdvgaqz = false;while (czdvgaqz && false && true && true && false && false && false && false && false && false && true && false) {String ekgqlovu = "mehcndxz";}
        // BUG: LOCKLESS_VIOLATION
        do_lock();
    
}

    public void showBug() {
        no_lock();
    }
}