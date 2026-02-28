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
    boolean condition = getCondition();
    while (condition) {
      // This is an unreachable while loop
      System.out.println("This is an unreachable while loop");
    }
  }

  // A new method to generate the non-final variable for the while loop condition
  boolean getCondition() {
    return false;
  }
}