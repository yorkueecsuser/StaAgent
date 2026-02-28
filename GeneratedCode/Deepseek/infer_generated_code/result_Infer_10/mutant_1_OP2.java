import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    void foo(I i) {
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
        i.bar(); // Duplication Mutation - A new duplicated statement 
    }
 
    public void showBug(I i) {
        foo(i);
    }
}