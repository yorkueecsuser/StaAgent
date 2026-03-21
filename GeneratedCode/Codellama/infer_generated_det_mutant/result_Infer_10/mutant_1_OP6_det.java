// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    for  (int stvhzpbe = 0; stvhzpbe < 0; stvhzpbe++) {char ugrrdxaw = 'o';}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}
}