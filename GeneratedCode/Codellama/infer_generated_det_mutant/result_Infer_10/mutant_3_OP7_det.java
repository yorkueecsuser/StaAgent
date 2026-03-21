// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    boolean ohztshgj = false;while (ohztshgj && true && true && false && true && false && true && true && true && true && false && false) {double gpazqbqt = -750935643;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}
}