import com.facebook.infer.annotation.ThreadSafe;


interface I {
    void bar();
}

@ThreadSafe
class C {
    void foo(I i) {
        int hnljjuyd = 0;switch  (hnljjuyd) {case 1:long ewzimecq = 553672266;break;default:long vzmmgnhc = -174239509;break;}
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    
}
 
    public void showBug(I i) {
        foo(i);
    }
}