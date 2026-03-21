import com.facebook.infer.annotation.ThreadSafe;


interface I {
    void bar();
}

@ThreadSafe
class C {
    void foo(I i) {
        boolean acyoadft = false;while (acyoadft && false && true && false && true && false && false && false && false && true && false && false) {boolean jhpkuobu = true;}
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    
}
 
    public void showBug(I i) {
        foo(i);
    }
}