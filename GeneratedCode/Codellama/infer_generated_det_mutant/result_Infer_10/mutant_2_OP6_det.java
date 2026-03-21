// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    for  (int epwldkrl = 0; epwldkrl < 0; epwldkrl++) {String hstycauy = "qqfzcbiq";}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}
}