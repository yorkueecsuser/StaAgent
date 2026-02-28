import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    void foo(I i) {
        if (false) { // Unreachable if-else statement mutation operator
            System.out.println("This branch will never be executed");
        } else {
            i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
        }
    }

    public void showBug(I i) {
        foo(i);
    }
}