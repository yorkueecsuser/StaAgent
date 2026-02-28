import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    expensive();
  }
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }

  void unreachableForLoop() {
    for (int i = 0; getCondition(); i++) {
      /* unreachable code */
    }
  }
}