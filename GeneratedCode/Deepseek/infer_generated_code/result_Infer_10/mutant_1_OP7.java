import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    void foo(I i) {
        i.bar(); // MUTANT: INTERFACE_NOT_THREAD_SAFE
        while (false) { // Adding unreachable while loop
            // Empty body
        }
    }
 
    public void showBug(I i) {
        foo(i);
    }
}