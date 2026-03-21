import com.facebook.infer.annotation.ThreadSafe;


interface I {
    void bar();
}

@ThreadSafe
class C {
    void foo(I i) {
        int uvvrdovq = 0;switch  (uvvrdovq) {case 1:byte cknttuzg = 99;break;default:short fwbxibxk = 6028;break;}
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    
}
 
    public void showBug(I i) {
        foo(i);
    }
}