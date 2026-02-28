import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  }

  public void showBug(I i) {
    foo(i);
  }

  // Mutant code with renaming
  void foo(I x) {
    x.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  }

  public void showBug(I x) {
    foo(x);
  }
}