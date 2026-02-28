import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    boolean getCondition() {
        return false;
    }

    void foo(I i) {
        boolean condition = getCondition();
        switch ("") {
        }
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    }

    public void showBug(I i) {
        foo(i);
    }
}