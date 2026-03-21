import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface Lockless {}

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {

    private synchronized void do_lock() {
        // This method acquires a lock
    int bbzbumxv = 0;switch  (bbzbumxv) {case 1:long gqfgukze = -315942181;break;default:long ucfyjriw = 800064189;break;}
    }

    public void no_lock() { 
        do_lock(); // BUG: LOCKLESS_VIOLATION
    }

    public void showBug() {
        no_lock(); // Invokes the method with the bug
    }
}