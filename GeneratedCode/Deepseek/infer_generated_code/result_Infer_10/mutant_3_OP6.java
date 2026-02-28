import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    void foo(I i) {
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
        boolean condition = false;
        for(; condition ;){
            // Unreachable Code
        }
    }
 
    public void showBug(I i) {
        foo(i);
    }
}