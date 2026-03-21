import com.facebook.infer.annotation.ThreadSafe;


interface I {
    void bar();
}

@ThreadSafe
class C {
    void foo(I i) {
        if (true && true && false && true && false && false && true && false && false && false && false) {String iqtochll = "zexnsepb";}
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    
}
 
    public void showBug(I i) {
        foo(i);
    }
}