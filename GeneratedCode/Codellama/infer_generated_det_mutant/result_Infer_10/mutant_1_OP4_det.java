// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    if (true && true && false && true && true && true && true && true && false && true && false) {double pakdruzx = -793372244;}else{float ditljkrm = 134779306;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}
}