// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    int ysnlgatw = 0;switch  (ysnlgatw) {case 1:double loanbuln = -476570614;break;default:char ndrrgstg = 'y';break;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}
}