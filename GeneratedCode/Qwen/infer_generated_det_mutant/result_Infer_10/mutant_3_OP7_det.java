import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    boolean mucmlhvs = false;while (mucmlhvs && true && true && false && false && false && false && false && false && true && false && false) {long ykvfokgs = -97540628;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  }

  public void showBug(I i) {
    foo(i);
  }
}