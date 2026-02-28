import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    i.bar(); // DUPLICATION OF THE METHOD CALL
  }

  public void showBug(I i) {
    foo(i);
  }
}