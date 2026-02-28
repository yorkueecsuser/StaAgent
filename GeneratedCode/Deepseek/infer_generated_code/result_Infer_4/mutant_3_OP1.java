import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    String unreadVariable = ""; // This is a dead store.
    expensive();
  }
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}