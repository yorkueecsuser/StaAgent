import com.facebook.infer.annotation.ThreadSafe;

interface I {
    void bar();
}

@ThreadSafe
class C {
    void foo(I i) {
        do {
            i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
        } while (false);
    }
 
    public void showBug(I i) {
        foo(i);
    }
}