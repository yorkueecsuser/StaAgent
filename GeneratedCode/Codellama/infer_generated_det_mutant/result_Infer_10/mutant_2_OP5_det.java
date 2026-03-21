// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    int tpdaygxf = 0;switch  (tpdaygxf) {case 1:short vyhtodoh = -3635;break;default:char shcqxtyh = 'h';break;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  }
}