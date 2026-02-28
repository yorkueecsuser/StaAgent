import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    String deadStore1 = ""; // unique random variable name
    expensive();
  }
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    String deadStore2 = ""; // unique random variable name
    perfCritical();
  }
}