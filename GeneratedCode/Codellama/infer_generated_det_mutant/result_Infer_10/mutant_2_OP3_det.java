// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    if (true && false && true && true && true && false && false && false && false && false && false) {long xkviudgb = 60868337;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}
}