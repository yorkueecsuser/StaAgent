import com.facebook.infer.annotation.*;

class C {
  @PerformanceCritical
  void pC() {
    e();
  }
  @Expensive
  void e() {}
  // BUG: CHECKERS_CALLS_EXPENSIVE_METHOD

  public void showBug() {
    pC();
  }
}