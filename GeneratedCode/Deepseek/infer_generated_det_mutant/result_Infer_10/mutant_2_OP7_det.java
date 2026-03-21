import com.facebook.infer.annotation.ThreadSafe;


interface I {
    void bar();
}

@ThreadSafe
class C {
    void foo(I i) {
        boolean xrmwnoap = false;while (xrmwnoap && false && false && true && false && true && false && true && false && false && true && false) {char lhkomilk = 'u';}
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    
}
 
    public void showBug(I i) {
        foo(i);
    }
}