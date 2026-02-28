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
    // Inserted unreachable if-else branch
    boolean condition = false;
    if (condition) {
      // Unreachable code - This code will never be executed
      System.out.println("This code is unreachable");
    } else {
      // Reachable code - This code will be executed
      System.out.println("This code is reachable");
    }
  }
}