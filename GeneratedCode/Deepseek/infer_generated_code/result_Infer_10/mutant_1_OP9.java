import com.facebook.infer.annotation.ThreadSafe;

interface I {
    void bar();
}

@ThreadSafe
class C {
    void foo(I i) {
        while(true) { // Mutated loop
            i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
            if (true) { // Mutation condition
                break;
            }
        }
    }
 
    public void showBug(I i) {
        foo(i);
    }
}