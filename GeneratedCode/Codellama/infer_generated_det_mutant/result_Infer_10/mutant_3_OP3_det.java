// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    if (true && false && false && false && true && false && false && false && false && true && false) {int egxvnadq = -168284056;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}
}