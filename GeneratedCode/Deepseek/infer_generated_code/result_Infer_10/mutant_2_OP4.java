import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    void foo(I i) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
        } else {
            // Add a do-nothing statement to keep the if-else structure complete.
            boolean shouldNotRun = true;
        }
    }
 
    public void showBug(I i) {
        foo(i);
    }

    private boolean getCondition() {
        // This method ensures that the condition is determined at runtime.
        return false;
    }
}