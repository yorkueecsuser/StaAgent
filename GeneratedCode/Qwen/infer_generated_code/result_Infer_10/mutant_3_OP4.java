import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE

    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will execute if shouldRun is true
      System.out.println("This is reachable code.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is unreachable code.");
    }
  }

  public void showBug(I i) {
    foo(i);
  }

  private boolean getCondition() {
    // Always returns false to ensure the else block is unreachable
    return false;
  }
}