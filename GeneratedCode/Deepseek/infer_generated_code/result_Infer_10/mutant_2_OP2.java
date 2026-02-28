import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    void foo(I i) {
        i.bar(); 
        i.bar(); // Mutant 1: Duplication
    }

    public void showBug(I i) {
        foo(i);
    }
}