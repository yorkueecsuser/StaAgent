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
    
    // Mutation Operator: Unreachable while loop
    boolean condition = true;
    while (condition) {
      // The loop is unreachable because the condition is always true
    }
  }
}