import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This is an unreachable code block.");
    } else {
      i.bar(); // RacerD warns here - BUG: INTERFACE_NOT_THREAD_SAFE
    }
  }

  // Public method to demonstrate the bug
  public void showBug() {
    I i = new I() {
      @Override
      public void bar() {
        // Some non-thread-safe operation
        System.out.println("Performing non-thread-safe operation");
      }
    };
    foo(i);
  }
}