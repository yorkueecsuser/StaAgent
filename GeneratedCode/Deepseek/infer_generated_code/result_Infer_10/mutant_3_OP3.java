import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    void foo(I i) {
        boolean condition = true;
        if (condition) {
            i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
        } else {
            boolean unreachableCondition = false; // added unreachable condition
        }
    }

    public void showBug(I i) {
        foo(i);
    }
}