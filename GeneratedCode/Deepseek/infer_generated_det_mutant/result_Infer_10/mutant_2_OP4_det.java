import com.facebook.infer.annotation.ThreadSafe;


interface I {
    void bar();
}

@ThreadSafe
class C {
    void foo(I i) {
        if (true && false && false && true && false && true && true && true && false && true && false) {float fmmtaorn = 263176979;}else{char zjhifhyo = 'k';}
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    
}
 
    public void showBug(I i) {
        foo(i);
    }
}