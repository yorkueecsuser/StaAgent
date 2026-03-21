// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    if (true && true && false && false && true && true && true && true && false && true && false) {double bpokvsec = -573604599;}else{double jhnozkuk = -627635653;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}
}