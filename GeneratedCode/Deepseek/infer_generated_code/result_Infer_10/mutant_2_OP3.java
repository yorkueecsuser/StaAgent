import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    void foo(I i) {
        if(i.getClass().isAnnotationPresent(ThreadSafe.class)) {
            i.bar();
        }
    }
 
    public void showBug(I i) {
        foo(i);
    }
}