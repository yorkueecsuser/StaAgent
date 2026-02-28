import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE

    // Introduced unreachable for loop as per mutation operator
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is intended to be unreachable
    }
  }

  public void showBug(I i) {
    foo(i);

    // Introduced unreachable for loop as per mutation operator
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // This loop is intended to be unreachable
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false to keep the loop unreachable
  }
}