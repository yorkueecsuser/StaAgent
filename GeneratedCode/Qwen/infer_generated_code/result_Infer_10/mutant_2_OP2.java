import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    int dummy = 0; // Introduced a dummy variable for demonstration
    dummy = 1;     // Assignment statement to be duplicated
    dummy = 1;     // Duplicated assignment statement

    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  }

  public void showBug(I i) {
    foo(i);
  }
}