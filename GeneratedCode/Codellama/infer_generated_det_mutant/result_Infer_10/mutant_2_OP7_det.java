// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    boolean gxxilwct = false;while (gxxilwct && false && true && false && false && false && true && false && false && true && true && false) {byte teqagnqs = 29;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}
}