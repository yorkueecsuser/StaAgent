// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    short wdbeyorr = 4632;
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}
}