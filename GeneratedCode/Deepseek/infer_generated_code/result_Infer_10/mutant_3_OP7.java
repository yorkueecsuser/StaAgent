import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    final boolean unreachable = true;

    void foo(I i) {
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    }

    public void showBug(I i) {
        while(unreachable) {
            foo(i);
        }
    }
}