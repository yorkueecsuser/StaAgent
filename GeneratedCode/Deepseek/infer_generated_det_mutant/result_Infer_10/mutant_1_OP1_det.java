import com.facebook.infer.annotation.ThreadSafe;


interface I {
    void bar();
}

@ThreadSafe
class C {
    char zgzgoycm = 'i';
    void foo(I i) {
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    }
 
    public void showBug(I i) {
        foo(i);
    }
}