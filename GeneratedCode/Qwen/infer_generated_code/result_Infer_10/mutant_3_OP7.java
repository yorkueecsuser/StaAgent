import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
    }
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  }

  public void showBug(I i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
    }
    foo(i);
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the while loop unreachable
  }
}