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
        foo(i);
    }

    // Mutation: Renaming the method foo to fooMutation
    void fooMutation(I i) {
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    }
}