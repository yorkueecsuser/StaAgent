import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    void foo(I i) {
        String _deadVariable = "abcdefgh"; // MUTANT
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    }
 
    public void showBug(I i) {
        foo(i);
    }
}