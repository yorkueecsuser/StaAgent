import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    void foo(I i) {
        boolean shouldRun = false;
        switch (0) {
            case 0:
                // Unreachable code
                break;
        }
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    }
 
    public void showBug(I i) {
        foo(i);
    }
}