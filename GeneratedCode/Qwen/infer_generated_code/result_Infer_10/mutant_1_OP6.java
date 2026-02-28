import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE

    // Introduced Unreachable for loop as per mutation operator
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  public void showBug(I i) {
    foo(i);

    // Introduced another Unreachable for loop as per mutation operator
    boolean conditionForShowBug = getCondition();
    for (int k = 0; conditionForShowBug; k++) {
      // This loop is unreachable because conditionForShowBug will always be false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}