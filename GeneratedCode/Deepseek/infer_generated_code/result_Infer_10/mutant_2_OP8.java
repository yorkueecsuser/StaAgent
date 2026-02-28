import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface J {
    void bar();
}

class C {
    void foo(J j) {
        j.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    }

    public void showBug(J j) {
        foo(j);
    }
}