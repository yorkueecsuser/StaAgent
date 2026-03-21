import com.facebook.infer.annotation.ThreadSafe;


interface I {
    void bar();
}

@ThreadSafe
class C {
    void foo(I i) {
        if (true && true && false && true && true && true && false && false && false && false && false) {float pkbfphsl = -372900847;}else{double gnbqwnmf = 152464414;}
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    
}
 
    public void showBug(I i) {
        foo(i);
    }
}