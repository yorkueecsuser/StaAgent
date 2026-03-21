import com.facebook.infer.annotation.ThreadSafe;


interface I {
    void bar();
}

@ThreadSafe
class C {
    void foo(I i) {
        int izjzuwvg = 0;switch  (izjzuwvg) {case 1:long jasfhhca = -892687342;break;default:short vybpsemg = 4281;break;}
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    
}
 
    public void showBug(I i) {
        foo(i);
    }
}