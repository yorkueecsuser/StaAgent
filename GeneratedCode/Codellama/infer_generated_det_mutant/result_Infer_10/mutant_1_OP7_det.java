// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    boolean gbbklgsg = false;while (gbbklgsg && true && false && true && false && true && true && true && false && false && false && false) {byte firntgje = 91;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}
}