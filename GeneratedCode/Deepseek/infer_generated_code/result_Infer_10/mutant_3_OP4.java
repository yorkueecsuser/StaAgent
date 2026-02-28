import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    void foo(I i) {
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
        boolean condition = true;
        if (condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        } else {
            // Here we're adding an unreachable branch
            System.out.println("This code is unreachable");
        }
    }
 
    public void showBug(I i) {
        foo(i);
    }
}