// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    for  (int fbharnfd = 0; fbharnfd < 0; fbharnfd++) {String ocxaileg = "itfnpmud";}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}
}