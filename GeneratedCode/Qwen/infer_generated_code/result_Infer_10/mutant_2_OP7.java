import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  public void showBug(I i) {
    foo(i);

    // Introduced another unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}