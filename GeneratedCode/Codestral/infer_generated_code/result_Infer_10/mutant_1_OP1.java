import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // RacerD warns here - BUG: INTERFACE_NOT_THREAD_SAFE
  }

  public void showBug() {
    int unusedVariable = 5; // Dead store mutant
    I i = new I() {
      @Override
      public void bar() {
        System.out.println("Performing non-thread-safe operation");
      }
    };
    foo(i);
  }
}