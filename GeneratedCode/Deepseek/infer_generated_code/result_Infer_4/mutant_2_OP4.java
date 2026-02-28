import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void perfCritical() {
    boolean shouldRun = false;
    if(shouldRun) {
      expensive();
    }
  }
  @Expensive
  void expensive() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    perfCritical();
  }
}