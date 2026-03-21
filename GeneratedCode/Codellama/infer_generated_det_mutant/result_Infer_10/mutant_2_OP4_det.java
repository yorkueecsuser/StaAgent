// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  if (false && false && true && true && false && true && false && false && true && false && false) {float naygpava = 323354677;}else{byte wmsokasy = -69;}
  }
}