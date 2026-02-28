// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    do {
      i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    } while (true);
  }
}