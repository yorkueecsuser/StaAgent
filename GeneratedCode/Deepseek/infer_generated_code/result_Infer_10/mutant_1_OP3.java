import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    void foo(I i) {
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    }

    public void showBug(I i) {
        if(false) {
            foo(i);
        }
    }
}