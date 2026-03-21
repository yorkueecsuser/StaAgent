import com.facebook.infer.annotation.ThreadSafe;


interface I {
    void bar();
}

@ThreadSafe
class C {
    void foo(I i) {
        boolean bbqjqovt = false;while (bbqjqovt && true && false && true && false && true && false && true && true && false && false && false) {int uszneony = 709268452;}
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    
}
 
    public void showBug(I i) {
        foo(i);
    }
}